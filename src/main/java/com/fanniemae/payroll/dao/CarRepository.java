package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarRepository implements IQuery<String> {

	public CarRepository() {
		System.out.println("I am alive");

	}

	@Override
	public ArrayList<String> findAll() {
		return null;
	}

	@Override
	public Map<String, Double> findMaps() {

		Map<String, Double> carMap = new HashMap<>();

		carMap.put("Lexus", 50000d);
		carMap.put("RangeRover", 100000d);
		carMap.put("BMW", 90000d);

		return carMap;

	}

}
