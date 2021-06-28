package com.example.ContactInfoMng.Repository;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.ContactInfoMng.Entity.Contact;


//ここでは、エンティティのクラスとエンティティIDのクラス。ContactEntityとStringを指定します。
@Repository public interface ContactRepository extends CrudRepository<Contact, String>{
	//データ抽出 sql文を使うtrueになる
	@Query(value="SELECT MAX(contact_no)"+"FROM t_contact;", nativeQuery = true)
	//メソッドを呼び出す変数number
	int number();
	
	//@Query(value ="SELECT contact_no,)
	//完全一致検索 お問い合わせ種別
	//@Query(value="SELECT CONTACT_CD" +"FROM t_contact"+"WHERE CONTACT_CD LIKE '%To%';" ,nativeQuery = true)
	//ArrayList<String> getContactName();
	//あいまい検索 お問い合わせ内容
	
	//あいまい検索 お問い合わせ 企業・団体・組織名
	
	//あいまい検索 お名前 
}
//m_codeの２つの主キーを結合
