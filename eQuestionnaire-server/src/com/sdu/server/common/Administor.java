package com.sdu.server.common;

import java.io.Serializable;

import sdu.androidlab.isurvey.Database.annotation.Column;

public class Administor extends Person implements Serializable{
	public String adepartment;// 管理员部门
	public String apost;// 管理员职位
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
