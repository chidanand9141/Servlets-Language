package calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/div")
@WebServlet(urlPatterns = "/div",loadOnStartup = 2)
public class Division implements Servlet{

	static {
		System.out.println("Division class got loaded");
	}
	
	public Division() {
		System.out.println("Divison object got created");
	}
	@Override
	public void destroy() {
	System.out.println("Destroy Method is called");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method got invoked");
	}
	
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service method will be called");
		int a = Integer.parseInt(req.getParameter("num1"));
		double b = Double.parseDouble(req.getParameter("num2"));
//		double resut=num1/num2;
		res.getWriter().print("The Division of " + a + " and " + b + " is  " + (a / b));

	}

	

	
}
