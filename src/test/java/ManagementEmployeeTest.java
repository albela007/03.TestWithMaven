import static org.junit.Assert.*;

import org.junit.Test;

import com.fanniemae.payroll.Employee;
import com.fanniemae.payroll.ManagementEmployee;

public class ManagementEmployeeTest {

	
	//Positive scenario
	@Test
	public void testHourlyWage() {
		ManagementEmployee m = new ManagementEmployee(52000,40);
		float weeklySalary = m.getHourlyWage();
		
		assertTrue(weeklySalary ==25);
		
	}

	
	//Negative scenario
	/*@Test
	public void testHourlyWageNegative() {
		ManagementEmployee m = new ManagementEmployee(52000,40);
		float wage = m.getHourlyWage();
		
		//assertTrue(wage ==252);
		assertTrue("Salary: " + wage, wage == 252);
	}*/
	
	@Test
	public void testWeeklySalary() {
		ManagementEmployee m = new ManagementEmployee(52000,40);
		float weeklySalary = m.getWeeklySalary();
		
		assertTrue(weeklySalary ==1000);
		
	}
	
	@Test
	public void testMonthlySalary() {
		ManagementEmployee m = new ManagementEmployee(52000,40);
		float monthlySalary = m.getMonthlySalary();
		
		//assertTrue(monthlySalary > 4333.00);
		
		assertTrue("Salary: " + monthlySalary, monthlySalary > 4300.00);
	}
	
	@Test
	public void test() {
		Employee m = new ManagementEmployee(52000);
		float monthlySalary = m.getMonthlySalary();
		
		//assertTrue(monthlySalary > 4333.00);
		assertTrue("Salary: " + monthlySalary, monthlySalary > 4300.00);
	}
}
