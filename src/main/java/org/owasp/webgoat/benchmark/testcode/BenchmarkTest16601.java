package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest16601")
public class BenchmarkTest16601 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = "";
		java.util.Enumeration<String> headers = request.getHeaders("foo");
		if (headers.hasMoreElements()) {
			param = headers.nextElement(); // just grab first element
		}

		String bar = doSomething(param);
		
		javax.xml.xpath.XPathFactory xpf = javax.xml.xpath.XPathFactory.newInstance();
		javax.xml.xpath.XPath xp = xpf.newXPath();
		try {
			xp.compile(bar);
		} catch (javax.xml.xpath.XPathExpressionException e) {
			// OK to swallow
			System.out.println("XPath expression exception caught and swallowed: " + e.getMessage());
		}
	}  // end doPost
	
	private static String doSomething(String param) throws ServletException, IOException {

		String bar;
		
		// Simple if statement that assigns param to bar on true condition
		int i = 196;
		if ( (500/42) + i > 200 )
		   bar = param;
		else bar = "This should never happen"; 
	
		return bar;	
	}
}