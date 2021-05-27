package com.example.ContactInfoMng.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.ContactInfoMng.Entity.Employee;


//ここでは、エンティティのクラスとエンティティIDのクラス。CustomerEntityとStringを指定します。
@Repository public interface EmployeeRepository extends CrudRepository<Employee, String> { 
//	// データ抽出 
//	@Query(value="SELECT * " + " FROM employee;" , nativeQuery = true) 
//	ArrayList<Employee> getAll(); 

}