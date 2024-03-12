package com.cdac.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.training.entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer>
{
    
}
