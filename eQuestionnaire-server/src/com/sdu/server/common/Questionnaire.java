package com.sdu.server.common;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import sdu.androidlab.isurvey.Database.annotation.Column;
import sdu.androidlab.isurvey.Database.annotation.Table;

/**
 * 
 * @author zhenzxie
 * 
 */
@Table(name = "questionnaire")
public class Questionnaire implements Serializable {
	
	@Column(name = "qid")
	public long qid;
	@Column(name = "client_cid")
	public long client;
	@Column(name = "name")
	public String name;
	@Column(name = "createData")
	public Date createDate;// 创建日期
	@Column(name = "finishData")
	public Date finishDate;// 完成调查任务日期
	@Column(name = "template")
	public Integer template;// 使用的模�?	@Column(name = "sampleSize")
	public Integer sampleSize;// 调查样本数量
	@Column(name = "cost")
	public Double cost;// 价格
	@Column(name = "not")
	public String note;// 备注

	public long getQid() {
		return qid;
	}

	public void setQid(long qid) {
		this.qid = qid;
	}

	public long getClient() {
		return client;
	}

	public void setClient(long client) {
		this.client = client;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public Integer getTemplate() {
		return template;
	}

	public void setTemplate(Integer template) {
		this.template = template;
	}

	public Integer getSampleSize() {
		return sampleSize;
	}

	public void setSampleSize(Integer sampleSize) {
		this.sampleSize = sampleSize;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Questionnaire() {
	
	}
	
	public Questionnaire(Long client, String name, Date finishDate,
			Integer template, Integer sampleSize, Double cost, String note) {
		this.client = client;
		this.name = name;
		this.createDate = new Date();
		this.finishDate = finishDate;
		this.template = template;
		this.sampleSize = sampleSize;
		this.cost = cost;
		this.note = note;
	}

	/**
	 * @see sdu.androidlab.isurvey.Data.BaseData#fillData(java.sql.ResultSet)
	 */
	
	public boolean fillData(ResultSet resultSet) {
	
		boolean done = true;
		try {
			this.qid = resultSet.getLong("qid");
			this.client = resultSet.getLong("client_cid");
			this.name = resultSet.getString("name");
			this.createDate = resultSet.getDate("createData");
			this.finishDate = resultSet.getDate("finishData");
			this.template = resultSet.getInt("template");
			this.sampleSize = resultSet.getInt("sampleSize");
			this.cost = resultSet.getDouble("cost");
			this.note = resultSet.getString("note");

		} catch (SQLException e) {
			e.printStackTrace();
			done = false;
		}
		return done;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	
		return "Questionnaire [qid=" + qid + ", client=" + client + ", name="
				+ name + ", createDate=" + createDate + ", finishDate="
				+ finishDate + ", template=" + template + ", sampleSize="
				+ sampleSize + ", cost=" + cost + ", note=" + note + "]";
	}

}
