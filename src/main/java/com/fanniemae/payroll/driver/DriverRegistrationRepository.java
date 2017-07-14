package com.fanniemae.payroll.driver;


import com.fanniemae.payroll.dao.RegistrationRepository;
import com.fanniemae.payroll.model.Registration;

public class DriverRegistrationRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrationRepository r = new RegistrationRepository();
		 
		Registration t = new Registration(1000,"john","boulet",35) ;
		
		r.insert(t);
	//	r.delete(1001);
		//System.out.println(t);
		
	}
	

}
