package com.garreffd.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.garreffd.dao.Dao;
import com.garreffd.entity.Course;

@Service
public class CourseService implements StudentManagementService<Course> {

	@Autowired 
	Dao<Course> courseDao;
	
	/**
	 * Gets a course from the system
	 * @param id - the id of the course to get from the database
	 * @return The course of given id, or null if a course with that id does not exist.
	 */
	@Override
	@Transactional
	public Course get(int id) {
		Course course = courseDao.get(id);
		return course;
	}
	
	/**
	 * Save a course to the system
	 * @param entity - the entity/model to save to the database system
	 */
	@Override
	@Transactional
	public void save(Course entity) {
		courseDao.save(entity);
	}

}
