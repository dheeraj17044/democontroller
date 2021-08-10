package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.services.CourseService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class DemoController {

	@Autowired
	CourseService courseService;
	
//	path = "users", 
	        
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) 
	{
		System.out.println(course.getId());
		return courseService.addCourse(course);
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable(value="courseId") String courseId) 
	{
		return new Course(1,"React");
	}
	
}
