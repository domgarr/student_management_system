package com.garreffd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garreffd.entity.Course;
import com.garreffd.service.CourseService;
import com.garreffd.service.StudentManagementService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private StudentManagementService<Course> courseService;
	
	@GetMapping("/showFormAddCourse")
	public String showFormAddCourse(Model model) {
		//Need to create a model attribute to bind form data.
		Course course = new Course();
		
		model.addAttribute("course", course);
		
		return "course-form";
	}
	
	@PostMapping("/saveCourse")
	public String saveCourse(@ModelAttribute("course") Course course) {
		System.out.println("CourseController here delegating saving to courseService...");
		courseService.save(course);
		
		return "redirect:/course/showFormAddCourse";
	}
}
