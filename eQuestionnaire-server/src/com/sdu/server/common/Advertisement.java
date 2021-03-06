package com.sdu.server.common;

import sdu.androidlab.isurvey.Database.annotation.Column;
import sdu.androidlab.isurvey.Database.annotation.Table;

/**
 * 
 * @author zhenzxie
 * 
 */
@Table(name = "advertisement")
public class Advertisement {

	@Column(name = "aid")
	public Long aid;
	@Column(name = "content")
	public String content;
	@Column(name = "image")
	public String image;// 图片路径
	@Column(name = "")
	public Long questionnaire_qid;
	
	public Advertisement() {
	
	}
	
	public Advertisement(String content, String image, Long questionnaire) {

		this.content = content;
		this.image = image;
		this.questionnaire_qid = questionnaire;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	
	public String toString() {
	
		return "Advertisement [aid=" + aid + ", content=" + content
				+ ", image=" + image + ", questionnaire_qid="
				+ questionnaire_qid + "]";
	}

}
