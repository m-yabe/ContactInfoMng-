package com.example.ContactInfoMng.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_contact")
public class Contact {

	@Id
	@Column(name="CONTACT_NO" ,columnDefinition = "int")
	private String CONTACT_NO;
	
	@Column(name= "CONTACT_CD" ,columnDefinition = "varchar(3)")
	private String CONTACT_CD;
	
	@Column(name="COMPANY" ,columnDefinition = "varchar(100)")
	private String COMPANY;
	
	@Column(name="REGISTER" ,columnDefinition = "varchar(41)")
	private String REGISTER;
	
	@Column(name="TEL" ,columnDefinition = "varchar(13)")
	private String TEL;
	
	@Column(name="MALL" ,columnDefinition = "varchar(100)")
	private String MALL;
	
	@Column(name="POSTAL_CODE" ,columnDefinition = "DEFAULT")
	private String POSTAL_CODE;
	
	@Column(name="STREET_ADDRESS" ,columnDefinition = "varchar(400)")
	private String STREET_ADDRESS;
	
	@Column(name="CONTENTS" ,columnDefinition = "varchar(2000)")
	private String CONTENTS;
	
	@Column(name="SALE_STAFF_NO" ,columnDefinition = "varchar(5)")
	private String SALE_STAFF_NO;
	
	@Column(name="RECEPTION_DATE" ,columnDefinition = "datetime")
	private String RECEPTION_DATE;
	
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	private String CREATE_DATE;
	
	@Column(name="CREATE_USER" ,columnDefinition = "varchar(10)")
	private String CREATE_USER;
	
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	private String UPDATE_DATE;

	@Column(name="UPDATE_USER" ,columnDefinition = "varchar(10)")
	private String UPDATE_USER;
	
	
	public String getcontact_NO() {
		return CONTACT_NO;
	}
	public void setcontact_NO(String CONTACT_NO) {
		this.CONTACT_NO = CONTACT_NO;
	}
	public String getcontact_CD() {
		return CONTACT_CD;
	}
	public void setcontact_CD(String CONTACT_CD) {
		this.CONTACT_CD = CONTACT_CD;
	}
	public String getcompany() {
		return COMPANY;
	}
	public void setcompany(String COMPANY) {
		this.COMPANY = COMPANY;
	}
	public String getregister() {
		return REGISTER;
	}
	public void setregister(String REGISTER) {
		this.REGISTER= REGISTER;
	}
	public String gettel() {
		return TEL;
	}
	public void settel(String TEL) {
		this.TEL = TEL;
	}
	public String getmall() {
		return MALL;
	}
	public void setmall(String MALL) {
		this.MALL = MALL;
	}
	public String getpostal_CODE() {
		return POSTAL_CODE;
	}
	public void setpostal_CODE(String POSTAL_CODE) {
		this.POSTAL_CODE = POSTAL_CODE;
	}
	public String getstreet_ADDRESS() {
		return STREET_ADDRESS;
	}
	public void setstreet_ADDRESS(String STREET_ADDRESS) {
		this.STREET_ADDRESS = STREET_ADDRESS;
	}
	public String getcontents() {
		return CONTENTS;
	}
	public void setcontents(String CONTENTS) {
		this.CONTENTS = CONTENTS;
	}
	public String getsale_STAFF_NO() {
		return SALE_STAFF_NO;
	}
	public void setsale_STAFF_NO(String SALE_STAFF_NO) {
		this.SALE_STAFF_NO = SALE_STAFF_NO;
	}
	public String getreception_DATE() {
		return RECEPTION_DATE;
	}
	public void setreception_DATE(String RECEPTION_DATE) {
		this.RECEPTION_DATE = RECEPTION_DATE;
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
//	public void setupdate_USER(String UPDATE_USER) {
//		this.UPDATE_USER = UPDATE_USER;
//	}
//	public void setAll(  String CONTACT_NO
//						,String CONTACT_CD
//						,String COMPANY
//						,String REGISTER
//						,String TEL
//						,String MALL
//						,String POSTAL_CODE
//						,String STREET_ADDRESS
//						,String CONTENTS
//						,String SALE_STAFF_NO
//						,String RECEPTION_DATE
//						,String CREATE_DATE
//						,String CREATE_USER
//						,String UPDATE_DATE
//						,String UPDATE_USER
//						
//						) {
//		this.CONTACT_NO = CONTACT_NO;
//		this.CONTACT_CD = CONTACT_CD;
//		this.COMPANY = COMPANY;
//		this.REGISTER = REGISTER;
//		this.TEL = TEL;
//		this.MALL = MALL;
//		this.POSTAL_CODE = POSTAL_CODE;
//		this.STREET_ADDRESS = STREET_ADDRESS;
//		this.CONTENTS = CONTENTS;
//		this.SALE_STAFF_NO = SALE_STAFF_NO;
//		this.RECEPTION_DATE = RECEPTION_DATE;
//		this.CREATE_DATE = CREATE_DATE;
//		this.CREATE_USER = CREATE_USER;
//		this.UPDATE_DATE = UPDATE_DATE;
//		this.UPDATE_USER = UPDATE_USER;
//		
//	}
	
}