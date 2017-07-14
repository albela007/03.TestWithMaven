package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CityRepository;
import com.fanniemae.payroll.model.City;

public class DriverCityRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CityRepository dao = new CityRepository();
		//dao.findAll().forEach(System.out::println);
		
		City city = dao.findByKey("100");
		System.out.println(city);
	}

}
