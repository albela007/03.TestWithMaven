package com.fanniemae.payroll.driver;

import java.util.HashMap;
import java.util.Set;

public class DriverMap {
	/* the objective of this topic is
	 * to discuss the relationship
	 * between the Map interface and HashMap
	 * implementation
	 * my name is LP
	 * change-2
	 * change-4
	 * change-5
	 */
	public static void main(String[] args) {

		HashMap<String, Double> map = new HashMap<>();

		map.put("david", 1000000d);
		map.put("lucy", 2000000d);
		map.put("peter", 3000000d);

		System.out.println(map.get("david"));
		System.out.println(map.size());

		Set<String> keys = map.keySet();

		for (String string : keys) {
			System.out.println(string.toUpperCase());
		}

	}
}
