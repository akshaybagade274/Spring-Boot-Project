package com.cdac.CourseEnrollment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.CourseEnrollment.entities.Course;
import com.cdac.CourseEnrollment.entities.Teacher;
import com.cdac.CourseEnrollment.services.TeacherService;

@RestController
public class TeacherController {
	 @Autowired
	    private TeacherService teacherService;

	    // Endpoint to get information about all teachers
	    @GetMapping("/all")
	    public List<Teacher> getAllTeachers() {
	        return teacherService.getAllTeachers();
	    }

	    // Endpoint to get information about a specific teacher
	    @GetMapping("/{teacherId}")
	    public Teacher getTeacherById(@PathVariable String teacherId) {
	        return teacherService.getTeacherById(teacherId);
	    }

	    // Endpoint to assign a teacher to a course
	    @PostMapping("/{teacherId}/assign-course")
	    public void assignCourse(@PathVariable String teacherId, @RequestParam String courseId) {
	        teacherService.assignCourse(teacherId, courseId);
	    }

	    // Endpoint to remove a course from a teacher
	    @PostMapping("/{teacherId}/remove-course")
	    public void removeCourse(@PathVariable String teacherId, @RequestParam String courseId) {
	        teacherService.removeCourse(teacherId, courseId);
	    }

}
