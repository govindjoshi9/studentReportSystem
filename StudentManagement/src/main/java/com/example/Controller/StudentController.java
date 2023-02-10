package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Entity.Students;
import com.example.Repository.StudentRepository;
import com.example.Service.StudentService;



@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/add")
	public String addStudent(Model model) {
		Students students = new Students();
		model.addAttribute("students", students);
		return "Add_Student";
		
	}
	
	@PostMapping("/addStudents")
	public String saveStudent(@ModelAttribute("students") Students students) {
		studentService.saveStudent(students);
		return "redirect:/students";
	}
	
	@GetMapping("/student-marks-card-json")
	@ResponseBody
	public Students displayMarks(@RequestParam(name="name", required=false, defaultValue="nuull") String name, @RequestParam(name="sem", required=false, defaultValue="0") int sem, @RequestParam(name="english", required=false, defaultValue="0") int english, @RequestParam(name="maths", required=false, defaultValue="0") int maths, @RequestParam(name="science", required=false, defaultValue="0") int science)
	{
		Students marks = new Students();
		marks.setName(name);
		marks.setSem(sem);
		marks.setEnglish(english);
		marks.setMaths(maths);
		marks.setScience(science);

//        marks.setTotal(marks.getPhysics() + marks.getChemistry() + marks.getMaths());
//
//		marks.setAverage(marks.getTotal() / 3);
//
//		if(marks.getAverage()>=80)
//		{
//			marks.setGrade('A');
//		}
//		else if(marks.getAverage()>=50)
//		{
//			marks.setGrade('B');
//		}
//		else
//		{
//			marks.setGrade('C');
//		}

		marks.getName();
		marks.getSem();
		marks.getEnglish();
		marks.getMaths();
		marks.getScience();


		return marks;
	}
	
	
}
