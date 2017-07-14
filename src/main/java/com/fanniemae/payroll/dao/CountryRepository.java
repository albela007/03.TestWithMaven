package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fanniemae.payroll.model.City;
import com.fanniemae.payroll.model.Country;

public class CountryRepository extends AbstractSQLDAO 
 	implements IQuery<Country>{
	
	ArrayList<Country> list =new ArrayList<>();

	@Override
	protected void results(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		// System.out.println(rs.getString("name"));
		//System.out.println("id=" + rs.getString("id") + ", name=" + rs.getString("name") + ",population="
			//	+ rs.getInt("population"));

		String code=rs.getString("code");
		String name = rs.getString("name");
		int population = rs.getInt("population");
		
		list.add(new Country(code, name, population));
	}

	@Override
	public ArrayList<Country> findAll() {
		String sql = "select code, name, population from country";
		super.process(sql);
		return list;
	}

	
	@Override
	public Country findByKey(String key) {
		String sql = "select code, name, population from country where code = '" + key + "'";
		System.out.println(sql);
		super.process(sql);
		
		
		Country country = list.get(0);
		return country;
}
}
