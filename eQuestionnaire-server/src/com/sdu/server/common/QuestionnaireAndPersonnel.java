
package com.sdu.server.common;

import java.io.Serializable;

import sdu.androidlab.isurvey.Database.annotation.Column;
import sdu.androidlab.isurvey.Database.annotation.Table;

/**
 * @author zhenzxie
 * 
 */
@Table(name = "questionnaire_has_personnel")
public class QuestionnaireAndPersonnel implements Serializable {
	
	@Column(name = "questionnaire_qid")
	public Integer questionnaire_qid;
	@Column(name = "personnel_id")
	public Integer personnel_id;
	@Column(name = "count")
	public Integer count;
	
	public Integer getQuestionnaire_qid() {
		return questionnaire_qid;
	}

	public void setQuestionnaire_qid(Integer questionnaire_qid) {
		this.questionnaire_qid = questionnaire_qid;
	}

	public Integer getPersonnel_id() {
		return personnel_id;
	}

	public void setPersonnel_id(Integer personnel_id) {
		this.personnel_id = personnel_id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * 
	 */
	public QuestionnaireAndPersonnel() {
	
		
	}
	
	/**
	 * @param questionnaire_qid
	 * @param personnel_id
	 * @param count
	 */
	public QuestionnaireAndPersonnel(Integer questionnaire_qid,
			Integer personnel_id, Integer count) {
	
		super();
		this.questionnaire_qid = questionnaire_qid;
		this.personnel_id = personnel_id;
		this.count = count;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	
	public String toString() {
	
		return "QuestionnaireAndPersonnel [questionnaire_qid="
				+ questionnaire_qid + ", personnel_id=" + personnel_id
				+ ", count=" + count + "]";
	}

}
