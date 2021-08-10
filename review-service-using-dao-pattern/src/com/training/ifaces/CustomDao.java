package com.training.ifaces;
import java.util.*;
public interface CustomDao<T> {

	public boolean add(T t);
	public List<T> findAll();
	
}
