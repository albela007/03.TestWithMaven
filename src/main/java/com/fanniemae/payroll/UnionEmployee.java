package com.fanniemae.payroll;

public class UnionEmployee extends Employee {

	float hoursWorked = 40f;

	public UnionEmployee(float yearlySalary) {
		super(yearlySalary);
	}

	public UnionEmployee(float yearlySalary, float hoursWorked) {
		super(yearlySalary);
		this.hoursWorked = hoursWorked;
	}

	//code = new, code == season
	public UnionEmployee(String code, float yearlySalary, float hoursWorked) throws Exception {
		super(yearlySalary);
		this.hoursWorked = hoursWorked;
		if (hoursWorked > 40 && code.equals("new")){
			Exception e = new Exception();
			throw e;
		}
	}
	
	
	
	@Override
	public float getWeeklySalary() {

		float othours = 0;
		float otpay = 0;
		float weeklySalary = 0;

		if (hoursWorked > 40) {
			othours = this.hoursWorked - 40;
			otpay = othours * this.getOverTimeHourlyWage();
			weeklySalary = 40 * super.getHourlyWage() + otpay;
		}
		else {
			weeklySalary = super.getHourlyWage() * this.hoursWorked;
		}

		return weeklySalary;
	}

	@Override
	public float getOverTimeHourlyWage() {
		float ot = super.getHourlyWage() * 1.5f;
		return ot;
	}

	// Annotations
	@Override
	// the above override keyword tells the compiler to look at the parent and
	// indicates that the tostring even
	// if it is misspelt --compiler corrects it to 'toString'

	public String toString() {
		return " Iam an employee that makes " + this.getYearlySalary() + " yearly";
	}
}
