package calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
 


public class Addition implements Servlet {

	@Override
	public void destroy() {   //ctr+shift+f align
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto -generated method stub
		
		
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		res.getWriter().print("The sum of" + a + " and " + b + " is  " + (a + b));

		
		
		//		System.out.println("The sum of" + a + " and " + b + " is  " + (a + b));
//        System.out.println(req.getParameter("num1"));
//        System.out.println(req.getParameter("num2"));


	}

}

//@webservlets