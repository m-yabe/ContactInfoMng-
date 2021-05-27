package com.example.ContactInfoMng.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ContactInfoMng.Entity.Code;


//ここでは、エンティティのクラスとエンティティIDのクラス。CustomerEntityとStringを指定します。
@Repository public interface CodeRepository extends CrudRepository<Code, String> { 
//	データ抽出 
//	@Query(value="SELECT * " + " FROM code;" , nativeQuery = true) 
//	ArrayList<Code> getAll(); 
}