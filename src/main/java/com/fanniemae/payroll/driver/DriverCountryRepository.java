package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CityRepository;
import com.fanniemae.payroll.dao.CountryRepository;

public class DriverCountryRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryRepository dao = new CountryRepository();
		//CityRepository dao = new CityRepository();
		dao.findAll().forEach(System.out::println);;
	}

}
