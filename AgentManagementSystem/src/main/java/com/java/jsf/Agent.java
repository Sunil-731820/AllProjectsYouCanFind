package com.java.jsf;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="agent")
@SessionScoped
public class Agent {
	private int AgentID;
	private String Name;
	private String City;
	private Gender GENDER;
	private int MaritalStatus;
	private double Premium;
	public int getAgentID() {
		return AgentID;
	}
	public void setAgentID(int agentID) {
		AgentID = agentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Gender getGENDER() {
		return GENDER;
	}
	public void setGENDER(Gender gENDER) {
		GENDER = gENDER;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	
	
	static AgentDAO dao;
	static {
		dao = new AgentDAO();
	}
	
	public Agent[] showAgent()  throws ClassNotFoundException, SQLException {
		return dao.showAgent();
	}
	
	
	

}
