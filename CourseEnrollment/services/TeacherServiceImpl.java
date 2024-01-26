package com.cdac.CourseEnrollment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.CourseEnrollment.dao.CourseDao;
import com.cdac.CourseEnrollment.dao.TeacherDao;
import com.cdac.CourseEnrollment.entities.Course;
import com.cdac.CourseEnrollment.entities.Teacher;
@Service
public class TeacherServiceImpl implements TeacherService {

	
		// TODO Auto-generated constructor stub
		
		@Autowired
	    private TeacherDao teacherRepository;

	    @Autowired
	    private CourseDao courseRepository;  // Assuming you have a CourseRepository

	   

	   

@Override
public List<Teacher> getAllTeachers() {
	// TODO Auto-generated method stub
	 return teacherRepository.findAll();
}

@Override
public Teacher getTeacherById(String teacherId) {
	// TODO Auto-generated method stub
	return teacherRepository.getById(teacherId);
}

@Override
public void assignCourse(String teacherId, String courseId) {
	Teacher teacher = teacherRepository.getById(teacherId);
    Course course = courseRepository.getById(courseId);

    if (teacher != null && course != null) {
        teacher.assignCourse(course);
        teacherRepository.save(teacher);
    }
	
}

@Override
public void removeCourse(String teacherId, String courseId) {
	Teacher teacher = teacherRepository.getById(teacherId);
    Course course = courseRepository.getById(courseId);

    if (teacher != null && course != null) {
        teacher.removeCourse(course);
        teacherRepository.save(teacher);
    }
	
}

}
