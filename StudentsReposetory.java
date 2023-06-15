package com.example.bootdemo.reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.Students;

public interface StudentsReposetory extends JpaRepository<Students, String>{// To perform CRUD operation with the database or specify table name
	
	
   List<Students> findByName(String name);
   
   List<Students> findByAge(int age);
   
   List<Students> findByAgeGreaterThan(int age);
   
   List<Students> findByAgeLessThan(int age);
   
     List<Students> findByAgeEquals(int age);
     
     List <Students> findByAgeGreaterThanEqual(int age);
     
     
   
}
