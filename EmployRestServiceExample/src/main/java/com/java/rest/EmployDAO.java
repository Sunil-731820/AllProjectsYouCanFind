package com.java.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

public class EmployDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public Employ[] showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd); 
		ResultSet rs = pst.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
			employList.add(employ);
		}
		return employList.toArray(new Employ[employList.size()]);
	}
	
	
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from Employ where empno =?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet res = pst.executeQuery();
		Employ employ = null;
		if(res.next()) {
			employ = new Employ();
			employ.setEmpno(res.getInt("empno"));
			employ.setName(res.getString("name"));
			employ.setGender(Gender.valueOf(res.getString("gender")));
			employ.setDept(res.getString("dept"));
			employ.setDesig(res.getString("desig"));
			employ.setBasic(res.getInt("basic"));
			
		}
		
		return employ;
		
	}
	
	
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getGender().toString());
		pst.setString(4, employ.getDept());
		pst.setString(5, employ.getDesig());
		pst.setInt(6, employ.getBasic());
		pst.executeUpdate();
		return "Record Inserted...";
	}
	

}
