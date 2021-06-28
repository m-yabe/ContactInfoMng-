package com.example.ContactInfoMng.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_contact")
public class Contact {

	@Id
	@Column(name="contact_no",columnDefinition="int")
	private String contact_no;
	//お問い合わせ種別
	@Column(name= "contact_cd",columnDefinition = "varchar(3)")
	private String contact_cd;
	//企業・団体・組織名
	@Column(name="company" ,columnDefinition = "varchar(100)")
	private String company;
	//お名前
	@Column(name="register" ,columnDefinition = "varchar(41)")
	private String register;
	//電話番号
	@Column(name="tel" ,columnDefinition = "varchar(13)")
	private String tel;
	//メールアドレス
	@Column(name="mall",columnDefinition = "varchar(100)")
	private String mall;
	//郵便番号
	@Column(name="postal_code" ,columnDefinition = "DEFAULT")
	private String postal_code;
	//ご住所
	@Column(name="street_address" ,columnDefinition = "varchar(400)")
	private String street_address;
	//お問い合わせ内容
	@Column(name="contents" ,columnDefinition = "varchar(2000)")
	private String contents;
	
//	@Column(name="SALE_STAFF_NO" ,columnDefinition = "varchar(5)")
//	private String SALE_STAFF_NO;
//	
//	@Column(name="RECEPTION_DATE" ,columnDefinition = "datetime")
//	private String RECEPTION_DATE;
//	
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	private String CREATE_DATE;
	
	@Column(name="CREATE_USER" ,columnDefinition = "varchar(10)")
	private String CREATE_USER;
	
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	private String UPDATE_DATE;

	@Column(name="UPDATE_USER" ,columnDefinition = "varchar(10)")
	private String UPDATE_USER;

	
	
	public String getcontact_NO() {
		return contact_no;
	}
	
	public void setcontact_NO(String Contact_no) {
		this.contact_no = Contact_no;
	}
	public String getcontact_CD() {
		return contact_cd;
	}
	public void setcontact_CD(String Contact_cd) {
		this.contact_cd = Contact_cd;
	}
	public String getcompany() {
		return company;
	}
	public void setcompany(String Company) {
		this.company = Company;
	}
	public String getregister() {
		return register;
	}
	public void setregister(String register1,String register2) {
		this.register= register1+" "+register2;
	}
	public String gettel() {
		return tel;
	}
	public void settel(String tel1,String tel2,String tel3) {
		this.tel = tel1 +"-"+ "tel2" +"tel3";
	}
	public String getmail() {
		return mall;
	}
	public void setmall(String Mall) {
		this.mall = Mall;
	}
	public String getpostal_CODE() {
		return postal_code;
	}
	public void setpostal_CODE(String post1,String post2) {
		this.postal_code = post1+"-"+post2;
	}
	public String getstreet_ADDRESS() {
		return street_address;
	}
	public void setstreet_ADDRESS(String Street_address) {
		this.street_address = Street_address;
	}
	public String getcontents() {
		return contents;
	}
	public void setcontents(String Contents) {
		this.contents = Contents;
	}
//	public String getsale_STAFF_NO() {
//		return SALE_STAFF_NO;
//	}
//	public void setsale_STAFF_NO(String SALE_STAFF_NO) {
//		this.SALE_STAFF_NO = SALE_STAFF_NO;
//	}
//	public String getreception_DATE() {
//		return RECEPTION_DATE;
//	}
//	public void setreception_DATE(String RECEPTION_DATE) {
//		this.RECEPTION_DATE = RECEPTION_DATE;
//	}
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
	public void setAll(
						String contact_cd
						,String company
						,String register1
						,String register2
						,String tel1
						,String tel2
						,String tel3
						,String mall
						,String post1
						,String post2
						,String street_addaress
						,String contents
						
						) {
		this.contact_cd = contact_cd;
		this.company = company;
		this.register = register1+register2;
		this.tel = tel1+tel2+tel3;
		this.mall = mall;
		this.postal_code = post1+post2;
		this.street_address = street_addaress;
		this.contents = contents;
		
	}

	
}