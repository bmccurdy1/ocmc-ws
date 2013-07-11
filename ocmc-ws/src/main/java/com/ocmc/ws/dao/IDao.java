package com.ocmc.ws.dao;

import java.util.List;

public interface IDao<T> {
	Long save(T t);
	void update(T t);
	void delete(T t);
	T get(Long id);
	List<T> getAll();
}
