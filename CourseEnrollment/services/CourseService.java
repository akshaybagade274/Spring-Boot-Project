package com.cdac.CourseEnrollment.services;

import java.util.List;

import com.cdac.CourseEnrollment.entities.Course;

public interface CourseService {
	public List<Course> getCourses();

//	public Course getCourse(int parseInt);


	public Course getCourse(long courseId);



	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long courseId);



	

}
