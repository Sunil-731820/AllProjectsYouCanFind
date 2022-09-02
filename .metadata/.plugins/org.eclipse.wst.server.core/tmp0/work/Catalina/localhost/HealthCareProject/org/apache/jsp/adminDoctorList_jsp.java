/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2022-07-22 04:36:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.java.jsp.Doctor;
import com.java.jsp.DoctorDAO;

public final class adminDoctorList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.java.jsp.DoctorDAO");
    _jspx_imports_classes.add("com.java.jsp.Doctor");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("	<style type=\"text/css\">\r\n");
      out.write("        body {\r\n");
      out.write("            background-image: url(\"img/Medical.jpg\");\r\n");
      out.write("            background-color: #cccccc;\r\n");
      out.write("        }\r\n");
      out.write("        .img-rounded {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");

	DoctorDAO dao = new DoctorDAO();
	Doctor[] arrDoctor = dao.showDoctor();


      out.write("\r\n");
      out.write("<table class=\"table table-dark\" border=\"12px\">\r\n");
      out.write("<thead class=\"thead-dark\">\r\n");
      out.write("	<tr >\r\n");
      out.write("		<th scope=\"col\">Id</th>\r\n");
      out.write("		<th scope=\"col\">First Name</th>\r\n");
      out.write("		<th scope=\"col\">Last Name</th>\r\n");
      out.write("		<th scope=\"col\">Gender</th>\r\n");
      out.write("		<th scope=\"col\">mobile Number </th>\r\n");
      out.write("		<th scope=\"col\">City</th>\r\n");
      out.write("		<th scope=\"col\">Email</th>\r\n");
      out.write("		<th scope=\"col\">Age</th>\r\n");
      out.write("		<th scope=\"col\">Address</th>\r\n");
      out.write("		<th scope=\"col\">Date</th>\r\n");
      out.write("		<th scope=\"col\">Qualification</th>\r\n");
      out.write("	</tr>\r\n");
      out.write("</thead>\r\n");
      out.write("	");

		for(Doctor doctor: arrDoctor){
	
      out.write("	\r\n");
      out.write("	<tbody>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getId() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getFname() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getLname() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getGender() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getMobile() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getCity() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getEmail() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getAge() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getAddress() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getDate() );
      out.write("</td>\r\n");
      out.write("		<td scope=\"row\">");
      out.print(doctor.getQualification() );
      out.write("</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("		");

		}
	
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
