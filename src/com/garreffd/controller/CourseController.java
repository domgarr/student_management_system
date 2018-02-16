package com.garreffd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garreffd.entity.Course;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@GetMapping("/showFormAddCourse")
	public String showFormAddCourse(Model model) {
		//Need to create a model attribute to bind form data.
		Course course = new Course();
		
		model.addAttribute("course", course);
		
		return "course-form";
	}
	
}
