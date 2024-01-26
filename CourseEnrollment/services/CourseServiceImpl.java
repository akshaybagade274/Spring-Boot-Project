package com.cdac.CourseEnrollment.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.cdac.CourseEnrollment.dao.CourseDao;
import com.cdac.CourseEnrollment.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
private CourseDao courseDao;
//	List<Course> list;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(1,"Java",30));
//		list.add(new Course(2,"SQL",30));
//		list.add(new Course(3,"C++",30));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		
//		for(Course course : list) {
//			if(course.getCourseId() == courseId) {
//				c = course;
//				break;
//						
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		
		courseDao.save(course);
		return course ;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e ->{
//			if(e.getCourseId() == course.getCourseId()) {
//				e.setCourseName(course.getCourseName());
//	
//			}
//		});
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
//		list = this.list.stream().filter(e -> e.getCourseId() != courseId).collect(Collectors.toList());
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}
	
	
	
	
	

	

	

}
