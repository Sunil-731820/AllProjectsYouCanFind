package com.java.jsf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	Connection connection;
	PreparedStatement pst;
	
	public Employ[] showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(res.next()) {
			employ = new Employ();
			employ.setEmpNo(res.getInt("empno"));
			employ.setName(res.getString("name"));
			employ.setGender(Gender.valueOf(res.getString("gender")));
			employ.setDept(res.getString("dept"));
			employ.setDesig(res.getString("desig"));
			employ.setBasic(res.getInt("basic"));
			employList.add(employ);
		}
		return employList.toArray(new Employ[employList.size()]);
	}

}
