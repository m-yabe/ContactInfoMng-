package com.example.ContactInfoMng.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="M_code")
public class Code {

	@Id
	@Column(name="CODE_CD" ,columnDefinition = "varchar(3)")
	private String CODE_CD;
	
	@Column(name= "CODE_CLASS",columnDefinition = "varchar(50)")
	private String CODE_CLASS;
	
	@Column(name="CODE_VALUE" ,columnDefinition = "varchar(3)")
	private String CODE_VALUE;
	
	@Column(name="CODE_NAME" ,columnDefinition = "varchar(50)")
	private String CODE_NAME;
	
	@Column(name="CODE_DESC" ,columnDefinition = "varchar(256)")
	private String CODE_DESC;
	
	@Column(name="CODE_NUM1" ,columnDefinition = "decimal(10,0)")
	private String CODE_NUM1;
	
	@Column(name="CODE_NUM2" ,columnDefinition = "decimal(10,0)")
	private String CODE_NUM2;
	
	@Column(name="CODE_NUM3" ,columnDefinition = "decimal(13,3)")
	private String CODE_NUM3;
	
	@Column(name="CODE_CHAR1" ,columnDefinition = "varchar(256)")
	private String CODE_CHAR1;
	
	@Column(name="CODE_CHAR2" ,columnDefinition = "varchar(256)")
	private String CODE_CHAR2;
	
	@Column(name="CODE_CHAR3" ,columnDefinition = "varchar(256)")
	private String CODE_CHAR3;
	
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	private String CREATE_DATE;
	
	@Column(name="CREATE_USER" ,columnDefinition = "varchar(10)")
	private String CREATE_USER;
	
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	private String UPDATE_DATE;

	@Column(name="UPDATE_USER" ,columnDefinition = "varchar(10)")
	private String UPDATE_USER;
	
	
	public String getcode_CD() {
		return CODE_CD;
	}
	public void setcode_CD(String code_CD) {
		this.CODE_CD = code_CD;
	}
	public String getcode_CLASS() {
		return CODE_CLASS;
	}
	public void setcode_CLAST(String CODE_CLASS) {
		this.CODE_CLASS = CODE_CLASS;
	}
	public String getcode_VALUE() {
		return CODE_VALUE;
	}
	public void setcode_VALUE(String CODE_VALUE) {
		this.CODE_VALUE = CODE_VALUE;
	}
	public String getcode_NAME() {
		return CODE_NAME;
	}
	public void setcode_NAME(String CODE_NAME) {
		this.CODE_NAME= CODE_NAME;
	}
	public String getcode_DESC() {
		return CODE_DESC;
	}
	public void setcode_DESC(String CODE_DESC) {
		this.CODE_DESC = CODE_DESC;
	}
	public String getcode_NUM1() {
		return CODE_NUM1;
	}
	public void setcode_NUM1(String CODE_NUM1 ) {
		this.CODE_NUM1 = CODE_NUM1;
	}
	public String getcode_NUM2() {
		return CODE_NUM2;
	}
	public void setcode_NUM2(String CODE_NUM2) {
		this.CODE_NUM2 = CODE_NUM2;
	}
	public String getcode_NUM3() {
		return CODE_NUM3;
	}
	public void setcode_NUM3(String CODE_NUM3) {
		this.CODE_NUM3 = CODE_NUM3;
	}
	public String getcode_CHAR1() {
		return CODE_CHAR1;
	}
	public void setcode_CHAR1(String CODE_CHAR1) {
		this.CODE_CHAR1 = CODE_CHAR1;
	}
	public String getcode_CHAR2() {
		return CODE_CHAR2;
	}
	public void setcode_CHAR2(String CODE_CHAR2) {
		this.CODE_CHAR2 = CODE_CHAR2;
	}
	public String getcode_CHAR3() {
		return CODE_CHAR3;
	}
	public void setcode_CHAR3(String CODE_CHAR3) {
		this.CODE_CHAR3 = CODE_CHAR3;
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
}
//	public void setupdate_USER(String UPDATE_USER) {
//		this.UPDATE_USER = UPDATE_USER;
//	}
//	public void setAll(  String CODE_CD
//						,String CODE_CLASS
//						,String CODE_VALUE
//						,String CODE_NAME
//						,String CODE_DESC
//						,String CODE_NUM1
//						,String CODE_NUM2
//						,String CODE_NUM3
//						,String CODE_CHAR1
//						,String CODE_CHAR2
//						,String CODE_CHAR3
//						,String CREATE_DATE
//						,String CREATE_USER
//						,String UPDATE_DATE
//						,String UPDATE_USER
//						
//						) {
//		this.CODE_CD = CODE_CD;
//		this.CODE_CLASS = CODE_CLASS;
//		this.CODE_VALUE = CODE_VALUE;
//		this.CODE_NAME = CODE_NAME;
//		this.CODE_DESC = CODE_DESC;
//		this.CODE_NUM1 = CODE_NUM1;
//		this.CODE_NUM2 = CODE_NUM2;
//		this.CODE_NUM3 = CODE_NUM3;
//		this.CODE_CHAR1 = CODE_CHAR1;
//		this.CODE_CHAR2 = CODE_CHAR2;
//		this.CODE_CHAR3 = CODE_CHAR3;
//		this.CREATE_DATE = CREATE_DATE;
//		this.CREATE_USER = CREATE_USER;
//		this.UPDATE_DATE = UPDATE_DATE;
//		this.UPDATE_USER = UPDATE_USER;
//		
//	}