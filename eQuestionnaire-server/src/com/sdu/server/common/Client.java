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
@Table(name = "client")
public class Client implements Serializable{
	
	@Column(name = "cid")
	public long cid;
	@Column(name = "email")
	public String email;
	@Column(name = "password")
	public String password;
	@Column(name = "companyName")
	public String companyName;// ε¬εΈε?	@Column(name = "province")
	public String province;// ζ?¨ηδ»½
	@Column(name = "city")
	public String city;// εεΈ
	@Column(name = "street")
	public String street;// θ‘ι
	@Column(name = "phone")
	public String phone;// θη³»η΅θ―
	@Column(name = "field")
	public String field;// δΈε‘ι’ε

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Client() {
	
	}

	public Client(String email, String password, String companyName,
			String province, String city, String street, String phone,
			String field) {
		this.email = email;
		this.password = password;
		this.companyName = companyName;
		this.province = province;
		this.city = city;
		this.street = street;
		this.phone = phone;
		this.field = field;
	}

	/**
	 * @see sdu.androidlab.isurvey.Data.BaseData#fillData(java.sql.ResultSet)
	 */
	
	@Override
	public String toString() {
		return "Client [cid=" + cid + ", email=" + email + ", password="
				+ password + ", companyName=" + companyName + ", province="
				+ province + ", city=" + city + ", street=" + street
				+ ", phone=" + phone + ", field=" + field + "]";
	}

}
