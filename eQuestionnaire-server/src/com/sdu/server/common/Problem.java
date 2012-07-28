package com.sdu.server.common;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import sdu.androidlab.isurvey.Database.annotation.Column;
import sdu.androidlab.isurvey.Database.annotation.Table;

/**
 * 
 * @author zhenzxie
 * 
 */
@Table(name = "problem")
public class Problem  implements Serializable{
	
	@Column(name = "pid")
	public long pid;
	@Column(name = "ptype")
	// TODO:change this to type
	public Integer type;// 问题类型，�?择题还是�?���?	@Column(name = "content")
	public String content;
	@Column(name = "choiceSize")
	public Integer choiceSize;
	@Column(name = "image")
	public String image;// 图片的路�?	@Column(name = "audio")
	public String audio;// 音频的路�?	@Column(name = "questionnaire_qid")
	public long questionnaire_qid;

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getChoiceSize() {
		return choiceSize;
	}

	public void setChoiceSize(Integer choiceSize) {
		this.choiceSize = choiceSize;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public long getQuestionnaire_qid() {
		return questionnaire_qid;
	}

	public void setQuestionnaire_qid(long questionnaire_qid) {
		this.questionnaire_qid = questionnaire_qid;
	}

	public Problem() {
	
	}

	public Problem(Integer type, String content, Integer choiceSize,
			String image, String audio, Long questionnaire) {
		this.type = type;
		this.content = content;
		this.choiceSize = choiceSize;
		this.image = image;
		this.audio = audio;
		this.questionnaire_qid = questionnaire;
	}

	/**
	 * @see sdu.androidlab.isurvey.Data.BaseData#fillData(java.sql.ResultSet)
	 */
	
	public boolean fillData(ResultSet resultSet) {
	
		boolean done = true;
		try {
			this.pid = resultSet.getLong("pid");
			this.questionnaire_qid = resultSet.getLong("questionnaire_qid");
			this.content = resultSet.getString("content");
			this.type = resultSet.getInt("ptype");// TODO:change this to type
			this.choiceSize = resultSet.getInt("choiceSize");
			this.image = resultSet.getString("image");
			this.audio = resultSet.getString("audio");
		} catch (SQLException e) {
			e.printStackTrace();
			done = false;
		}
		return done;
	}

}
