package com.example.Service;

import java.util.List;

import com.example.Entity.Students;

public interface StudentService {
	List<Students> getAllStudents();
	Students saveStudent(Students student);
}
