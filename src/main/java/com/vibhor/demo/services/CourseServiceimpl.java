package com.vibhor.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vibhor.demo.dao.CourseDao;
import com.vibhor.demo.entites.Course;
@Service
public class CourseServiceimpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	

		public  CourseServiceimpl() {

		}
		
	@Override
	public List<Course> getCourses() {
		
		
		return courseDao.findAll();
	}
	
		
		@Override
		public Course getCourse(long courseId) {
			return courseDao.findById(courseId);
		}

		@Override
		public Course addCourse(Course course) {
			courseDao.save(course);
			return course;
		}
		@Override
		public Course updateCourse(Course course) {
			courseDao.save(course);
			return course;
		}
		@Override
		public void deleteCourse(long parseLong) {
		Course entity =courseDao.getOne(parseLong);
		courseDao.delete(entity);
		}
		
}
