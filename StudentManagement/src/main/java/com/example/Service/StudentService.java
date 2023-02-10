package com.example.Service;

import java.util.List;

import com.nitin.Entity.Students;

public interface StudentService {
	List<Students> getAllStudents();
	Students saveStudent(Students student);
}
