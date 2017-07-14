package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.EmailProcess;

public class DriverThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmailProcess e = new EmailProcess();
		//e.sendEmail();
		
		Thread t2 = new Thread(e);
		t2.start();
		
		Thread t = new Thread(){
			
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println("Loop 2 " + i);

				}
			}
		};
		
		t.start();
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Loop 1 " + i);

		}

	}

}
