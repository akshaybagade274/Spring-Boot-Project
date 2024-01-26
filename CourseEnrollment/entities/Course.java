package com.cdac.CourseEnrollment.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
@Id
	private long courseId;
    private String courseName;
    private int maxStudents;
    
	


	public Course(long courseId, String courseName, int maxStudents) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.maxStudents = maxStudents;
		
	}


	public Course() {
		// TODO Auto-generated constructor stub
	}


	public long getCourseId() {
		return courseId;
	}


	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getMaxStudents() {
		return maxStudents;
	}


	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	

	
	

}
