package com.example.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "sname", nullable = false)
	private String name;
	@Column(name = "sem", nullable = false)
	private int sem;
	@Column(name = "english", nullable = false)
	private int english;
	@Column(name = "maths", nullable = false)
	private int maths;
	public Students(String name, int sem, int english, int maths, int science) {
		super();
		
		this.name = name;
		this.sem = sem;
		this.english = english;
		this.maths = maths;
		this.science = science;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	@Column(name = "science", nullable = false)
	private int science;
	
	public Students() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}

	
	
}
