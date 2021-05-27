package com.example.ContactInfoMng.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.ContactInfoMng.Entity.Contact;


//ここでは、エンティティのクラスとエンティティIDのクラス。CustomerEntityとStringを指定します。
@Repository public interface ContactRepository extends CrudRepository<Contact, String> { 
//	// データ抽出 
//	@Query(value="SELECT * " + " FROM contact;" , nativeQuery = true) 
//	ArrayList<Contact> getAll(); 

}