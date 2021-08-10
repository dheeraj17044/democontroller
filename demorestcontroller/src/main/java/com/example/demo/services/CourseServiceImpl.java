package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{

	List<Course> list;
	
	public CourseServiceImpl() 
	{
		list = new ArrayList<>();
//		list.add(new Course(1,"Java Backend"));
	}
	
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
	@Override
	public List<Course> getCourses()
	{
		return list;
	}

}
