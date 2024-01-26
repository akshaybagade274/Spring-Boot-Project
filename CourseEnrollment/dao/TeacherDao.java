package com.cdac.CourseEnrollment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.CourseEnrollment.entities.Course;

public interface TeacherDao extends JpaRepository<Course,Long>{

	

}
