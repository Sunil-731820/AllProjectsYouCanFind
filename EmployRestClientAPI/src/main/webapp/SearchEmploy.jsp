<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="com.java.rest.Employ"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="SearchEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/> 
			<input type="submit" value="Search" />
		</center>
	</form>
	<%
		if (request.getParameter("empno")!=null) {
			int empno = Integer.parseInt(request.getParameter("empno"));
	%>
		
	<%
	 URL url = new URL("http://localhost:8080/EmployRestServiceExample/webapi/employService/"+empno);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Accept", "application/json");
    if (conn.getResponseCode() != 200) {
        throw new RuntimeException("Failed : HTTP error code : "
                + conn.getResponseCode());
    }
    BufferedReader br = new BufferedReader(new InputStreamReader(
        (conn.getInputStream())));
    String output;
    String res="";
    while ((output = br.readLine()) != null) {
    	res+=output;
        //out.println(output);
    }
	%>

   
   
   	<%
   	Employ employ = new ObjectMapper().readValue(res, Employ.class);
	%>
	<table align="center" border="12">
	<tr>
	
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>	
	</tr>
		<tr>
			<td><%= employ.getName()%></td>
			<td><%=employ.getGender()%></td>
			<td><%=employ.getDept()%></td>
	 		<td><%=employ.getDesig() %></td>
	 		<td><%=employ.getBasic() %></td>

   		</tr>
   </table>
   <% 
   
    
		}
	%>
	

	
</body>
</html>