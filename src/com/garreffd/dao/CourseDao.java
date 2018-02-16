package com.garreffd.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.garreffd.entity.Course;

@Repository
public class CourseDao implements Dao<Course> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Course get(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Course> getCourseQuery = session.createQuery("from Course c where c.id = :id", Course.class);
		getCourseQuery.setParameter("id", id);
		Course course = getCourseQuery.getSingleResult();
		return course;
	}

	
	@Override
	public void save(Course entity) {
		Session session = sessionFactory.getCurrentSession();
		session.save(entity);
		
	}

}
