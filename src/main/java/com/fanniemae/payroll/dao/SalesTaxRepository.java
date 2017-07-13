package com.fanniemae.payroll.dao;

import java.util.ArrayList;

public class SalesTaxRepository implements IQuery {

	@Override
	public ArrayList<String> findAll() {
		ArrayList<String> list = new ArrayList<>();
		list.add("NY:8.25%");
		list.add("FL:6.25%");
		list.add("CT:5.25%");
		list.add("VA:6.25%");
		return list;
	}

}
