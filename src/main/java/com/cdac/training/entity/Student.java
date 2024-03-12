package com.cdac.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	
	@Column(name="studentbranch")
	private String branch;
	
	@Column(name="studentname")
	private String name;
	
	
	
	public Student()
	{
		
	}
	public Student(int rollno, String name, String branch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
	

}
