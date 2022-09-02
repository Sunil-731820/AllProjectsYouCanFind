package com.java.jsf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgentDAO {
	Connection connection;
	PreparedStatement pst;
	

	public Agent[] showAgent() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from Agent";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		List<Agent> agentList = new ArrayList<Agent>();
		Agent agent = null;
		while(res.next()) {
			agent = new Agent();
			agent.setAgentID(res.getInt("AgentID"));
			agent.setName(res.getString("Name"));
			agent.setCity(res.getString("City"));
			agent.setGENDER(Gender.valueOf(res.getString("GENDER")));
			agent.setMaritalStatus(res.getInt("MaritalStatus"));
			agent.setPremium(res.getDouble("Premium"));
			agentList.add(agent);
		}
		return agentList.toArray(new Agent[agentList.size()]);
		
	}

}
