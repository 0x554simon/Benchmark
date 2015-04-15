package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest04944")
public class BenchmarkTest04944 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		org.owasp.webgoat.benchmark.helpers.SeparateClassRequest scr = new org.owasp.webgoat.benchmark.helpers.SeparateClassRequest( request );
		String param = scr.getTheParameter("foo");
		
		
		String bar = "safe!";
		java.util.HashMap<String,Object> map63828 = new java.util.HashMap<String,Object>();
		map63828.put("keyA-63828", "a_Value"); // put some stuff in the collection
		map63828.put("keyB-63828", param.toString()); // put it in a collection
		map63828.put("keyC", "another_Value"); // put some stuff in the collection
		bar = (String)map63828.get("keyB-63828"); // get it back out
		bar = (String)map63828.get("keyA-63828"); // get safe value back out
		
		
		response.getWriter().print(bar);
	}
}