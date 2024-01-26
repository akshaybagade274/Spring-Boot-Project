package com.cdac.CourseEnrollment.services;

import java.util.List;

import com.cdac.CourseEnrollment.entities.Teacher;

public interface TeacherService {

	List<Teacher> getAllTeachers();

	Teacher getTeacherById(String teacherId);

	void assignCourse(String teacherId, String courseId);

	void removeCourse(String teacherId, String courseId);

}
