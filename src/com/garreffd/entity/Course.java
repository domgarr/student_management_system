package com.garreffd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class will store Course information, some important information includes the name of the course,
 * a description of the course, instructor teaching it, and the list of students taking it.
 * @author Domenic
 *
 */

@Entity 
@Table(name="course")
public class Course {
	@Id //Indicates that this field is a primary key.
	@GeneratedValue(strategy=GenerationType.IDENTITY) //This makes the id self-increment, similar to MySQL auto_increment
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	public Course() {
	}

	public Course(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
