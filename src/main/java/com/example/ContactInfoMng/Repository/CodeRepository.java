package com.example.ContactInfoMng.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ContactInfoMng.Entity.Code;


//ここでは、エンティティのクラスとエンティティIDのクラス。CustomerEntityとStringを指定します。
@Repository public interface CodeRepository extends CrudRepository<Code, String>{
//	データ抽出
	@Query(value="SELECT McodePK* " + " FROM m_code"+" WHERE CODE_CD='001';" , nativeQuery = true) 
	ArrayList<String> getCodeName();
	//二次元配列でCODE_VALUE[0]CODE_NAME[1]
}