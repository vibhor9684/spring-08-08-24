package com.vibhor.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vibhor.demo.entites.Course;

public interface CourseDao extends JpaRepository<Course,Long>{

}
