package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.Map;

public interface IQuery <T>  {

	public ArrayList<T> findAll();
	
	default public Map <String,Double> findMaps()
	{
		return null;
	}
}
