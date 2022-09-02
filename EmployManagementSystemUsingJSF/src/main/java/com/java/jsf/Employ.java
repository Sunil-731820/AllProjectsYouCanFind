package com.java.jsf;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "employ")
@SessionScoped
public class Employ {
	private int empNo;
	private String name;
	private Gender gender;
	private String dept;
	private String desig;
	private double basic;
	
	
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
	static EmployDAO dao;
	
	static  {
		 dao = new EmployDAO();
	}
	
	public Employ[] showEmploy() throws ClassNotFoundException, SQLException {
		return dao.showEmploy();
	}
	
	
	
	
	
	
	

}
