package com.fanniemae.payroll.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public abstract class AbstractSQLDAO {

	private BasicDataSource ds = new BasicDataSource();

	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	{
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("hexaware");
		ds.setUrl("jdbc:mysql://localhost:3306/world?useSSL=false");
	}

	public void modify(String sqlStatement) {
		
		//try catch resource
		//no need to close the db as connection class is a child of Connection which is
		//a child of Closeable which is a child of Autocloseable
		try(Connection con = ds.getConnection();)  {
			stmt = con.createStatement();
			stmt.executeUpdate(sqlStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void process(String sqlstatement) {

		try(Connection con = ds.getConnection();)  {

		
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlstatement);

			while (rs.next() == true) {
				/*
				 * System.out.println("id=" + rs.getString("id") + ", name=" +
				 * rs.getString("name") +",population=" +
				 * rs.getInt("population"));
				 */

				results(rs);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

	protected abstract void results(ResultSet rs) throws SQLException;
 
}
