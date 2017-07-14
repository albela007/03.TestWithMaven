package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CityRepository;
import com.fanniemae.payroll.dao.CountryRepository;
import com.fanniemae.payroll.model.City;
import com.fanniemae.payroll.model.Country;

public class DriverCountryRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryRepository dao = new CountryRepository();
		//CityRepository dao = new CityRepository();
		//dao.findAll().forEach(System.out::println);
		
			
		Country country = dao.findByKey("USA");
		System.out.println(country);
	}

}
