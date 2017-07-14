package com.fanniemae.payroll;

public class EmailProcess implements Runnable {
public void sendEmail(){
	System.out.println("email process started.. ");
	try {
		Thread.sleep(10_000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("email process Ended! ");
}

@Override
public void run() {
	 sendEmail();
	 
	
}
	
}
