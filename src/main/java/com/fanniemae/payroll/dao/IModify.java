package com.fanniemae.payroll.dao;

public interface IModify < T, K>{

	public void insert(T t);
	
	default void delete(K key){
		
	};
}
