package com.garreffd.dao;

public interface Dao<Entity> {
	public Entity get(int id);
	public void save(Entity entity);
}
