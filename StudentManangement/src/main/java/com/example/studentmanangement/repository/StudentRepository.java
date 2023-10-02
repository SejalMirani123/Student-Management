package com.example.studentmanangement.repository;

import com.example.studentmanangement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
