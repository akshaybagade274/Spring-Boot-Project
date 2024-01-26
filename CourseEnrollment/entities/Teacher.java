package com.cdac.CourseEnrollment.entities;

import java.util.List;
import java.util.ArrayList;

public class Teacher {

	

	private long teacherId;
    private String teacherName;
    private List<Course> assignedCourses;

    public Teacher(long teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.assignedCourses = new ArrayList<>();
    }

    // Getters and Setters

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(List<Course> assignedCourses) {
        this.assignedCourses = assignedCourses;
    }

    @Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", assignedCourses="
				+ assignedCourses + "]";
	}
}
