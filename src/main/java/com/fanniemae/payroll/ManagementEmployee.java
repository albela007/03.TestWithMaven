package com.fanniemae.payroll;

public class ManagementEmployee extends Employee {
	float hoursWorked = 40f;

	// constructor method
	public ManagementEmployee(float yearlySalary) {
		super(yearlySalary);

	}

	// over loading example-same name as above but diff parameters
	public ManagementEmployee(float yearlySalary, float hw) {
		super(yearlySalary);
		this.hoursWorked = hw;
	}

	@Override
	public float getOverTimeHourlyWage() {
		float otwage = 0f;
		if (hoursWorked >= 50 && hoursWorked < 60 ) {
			otwage = 1000 / (hoursWorked - 40);
		}
		else if (hoursWorked >= 60 && hoursWorked <80 ) {
			otwage = 2000 / (hoursWorked - 40);
		}
		else if (hoursWorked >= 80) {
			otwage = 4000 / (hoursWorked - 40);
		}
		return otwage;
	}

	@Override
	public float getWeeklySalary() {
		 
		
		float otSalary = super.getWeeklySalary();
		
		if (hoursWorked >= 50 && hoursWorked < 60 ) {
			otSalary = super.getWeeklySalary() + 1000;
		}
		else if (hoursWorked >= 60 && hoursWorked < 80 ) {
			otSalary = super.getWeeklySalary() + 2000;
		}
		else if (hoursWorked >= 80)  {
			otSalary = super.getWeeklySalary() + 4000;
		}
		return otSalary;
	}
	
	
	
}

	 
