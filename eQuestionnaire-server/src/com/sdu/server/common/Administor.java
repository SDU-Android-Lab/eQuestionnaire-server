package com.sdu.server.common;

import sdu.androidlab.isurvey.Database.annotation.Column;

public class Administor extends Person {
	public String adepartment;// ����Ա����
	public String apost;// ����Աְλ
	public Double salary;
	
	public String getAdepartment() {
		return adepartment;
	}
	public void setAdepartment(String adepartment) {
		this.adepartment = adepartment;
	}
	public String getApost() {
		return apost;
	}
	public void setApost(String apost) {
		this.apost = apost;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
