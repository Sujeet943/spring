package com.example.bootdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.Students;
import com.example.bootdemo.reposetory.StudentsReposetory;

@RestController// it is use to create controllers of rest api 
public class Controller {
	
	@Autowired
	StudentsReposetory sr;
	
	@PostMapping("/hi")
	
	public String m1() {
		
		//sr.save(null);
		return "hellow hii ";
	}
	
	@GetMapping("/hellow")
	
	public void m2() {
		
		System.out.println("get request is handled");
	}
	@GetMapping("/jj")
	public String m3() {
		
		return "get value";
	}
	
	@PostMapping("/savedata")
	public String save(@RequestBody Students s) {
		
		sr.save(s);
		return "Data save";
	}
	@GetMapping("/fetchData")
	public Students fetchStudentById(@RequestParam String name) {
		
		sr.findById(name);
		Optional<Students> os =sr.findById(name);
		
		Students s=os.get();
		return s;
	}
	
	@GetMapping("/studname")
	public List<Students> fetchStudentByName(@RequestParam String name){
		
		List<Students> students =sr.findByName(name);
		return students;
	}
	@GetMapping("/stdAll")
	public List<Students> fetchAllStudents(){
		
		List<Students> st=sr.findAll();
		return st;
	}
	
	@GetMapping("/ageEqual")
	
	public List<Students>findByAgeEqual(@RequestParam int age){
		
		return sr.findByAgeEquals(age);
	}
	
	@GetMapping("/greaterThanEqual")
	
	public List<Students>findByGreater(@RequestParam int age){
		
		return sr.findByAgeGreaterThanEqual(age);
	}
	
	@GetMapping("/greater")
	public List<Students> greaterThan(@RequestParam int age){
		
		return sr.findByAgeGreaterThan(age);
	}
	@GetMapping("/less")
	
	public List<Students> lessThan(@RequestParam int age){
		
		return sr.findByAgeLessThan(age);
	}
	
	}


