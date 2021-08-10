package com.example.demo.services;

import java.util.List;


import com.example.demo.entity.Course;

public interface CourseService {

	public Course addCourse(Course course);
	public List<Course> getCourses();
}
