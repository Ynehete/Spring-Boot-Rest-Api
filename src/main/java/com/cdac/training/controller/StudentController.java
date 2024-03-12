package com.cdac.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.training.entity.Student;
import com.cdac.training.repository.Studentrepo;

@RestController
@RequestMapping("/api")
public class StudentController 
{

	@GetMapping("/hello")
	public String sayHello()
	{
		return"say hello from spring API";
	}
	
	@Autowired
	Studentrepo repo;
	@GetMapping("/students")
	public List<Student> getallstudents()
	{
		List<Student>students=repo.findAll();
	    return students;	
	}
	
	@GetMapping("/student/{id}")
	public Student getstudent(@PathVariable int id)
	{
		Student student =repo.findById(id).get();
		return student;
	}
	
	@PostMapping("/student/add")
	public void createStudent(@RequestBody Student student)
	{
		repo.save(student);
	}
	
	@PutMapping("/student/update/{id}")
	public Student updatestudent(@PathVariable int id)
	{
		Student student =repo.findById(id).get();
		student.setName("yash");
		student.setBranch("DAC");
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void deletestudent(@PathVariable int id)
	{
		Student student=repo.findById(id).get();
		repo.delete(student);
	}
}
