package com.garreffd.service;

/**
 * Every Entity we create will implement this interface to ensure that all
 * entities contain the methods we need to save, get, and list all entities on
 * any given web page.
 * 
 * More on Service layer object. This class will handle the business logic, logic based off business rules
 * which are real world constraints on our system. For example, let's say a class room only had 30 seats, this layer
 * would ensure a max of 30 students are added to the system. In short, this class will determine how data is created, stored 
 * or changed.
 * 
 * @author Domenic
 *
 * @param <Entity> The class name of the Entity/Model
 */
public interface StudentManagementService<Entity> {
	
	public Entity get(int id);
	public void save(Entity entity);
}
