package com.example.ContactInfoMng.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="M_employee")
public class Employee {

	@Id
	@Column(name="E_NUM" ,columnDefinition = "varchar(5)")
	private String E_NUM;
	
	@Column(name="E_NAME" ,columnDefinition = "varchar(40)")
	private String E_NAME;
	
	@Column(name="E_YEAR" ,columnDefinition = "int")
	private String E_YEAR;
	
	@Column(name="DEPART_CD" ,columnDefinition = "char(2)")
	private String DEPART_CD;
	
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	private String CREATE_DATE;
	
	@Column(name="CREATE_USER" ,columnDefinition = "varchar(10)")
	private String CREATE_USER;
	
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	private String UPDATE_DATE;

	@Column(name="UPDATE_USER" ,columnDefinition = "varchar(10)")
	private String UPDATE_USER;
	
	
	public String gete_NUM() {
		return E_NUM;
	}
	public void sete_NUM(String E_NUM) {
		this.E_NUM = E_NUM;
	}
	public String gete_NAME() {
		return E_NAME;
	}
	public void sete_NAME(String E_NAME) {
		this.E_NAME = E_NAME;
	}
	public String gete_YEAR() {
		return E_YEAR;
	}
	public void sete_YEAR(String E_YEAR) {
		this.E_YEAR = E_YEAR;
	}
	public String getdepapt_CD() {
		return DEPART_CD;
	}
	public void setdepapt_CD(String DEPART_CD) {
		this.DEPART_CD = DEPART_CD;
	}
	public String getcreate_DATE() {
		return CREATE_DATE;
	}
	public void setcreate_DATE(String CREATE_DATE) {
		this.CREATE_DATE = CREATE_DATE;
	}
	public String getcreate_USER() {
		return CREATE_USER;
	}
	public void setcreate_USER(String CREATE_USER) {
		this.CREATE_USER = CREATE_USER;
	}
	public String getupdate_DATE() {
		return UPDATE_DATE;
	}
	public void setupdate_DATE(String UPDATE_DATE) {
		this.UPDATE_DATE = UPDATE_DATE;
	}
	public String getupdate_USER() {
		return UPDATE_USER;
	}
	public void setupdate_USER(String UPDATE_USER) {
		this.UPDATE_USER = UPDATE_USER;
	}
	
//	public void setAll(  String E_NUM
//						,String E_NAME
//						,String E_YEAR
//						,String DEPART_CD
//						,String CREATE_DATE
//						,String CREATE_USER
//						,String UPDATE_DATE
//						,String UPDATE_USER
//						
//						) {
//		this.E_NUM = E_NUM;
//		this.E_NAME = E_NAME;
//		this.E_YEAR = E_YEAR;
//		this.DEPART_CD = DEPART_CD;
//		this.CREATE_DATE = CREATE_DATE;
//		this.CREATE_USER = CREATE_USER;
//		this.UPDATE_DATE = UPDATE_DATE;
//		this.UPDATE_USER = UPDATE_USER;
//		
//	}
}