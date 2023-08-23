package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.Myuser;

@WebServlet("/Signup")
public class Signup extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String mobile=req.getParameter("mobile");
	String gender=req.getParameter("gender");
	String dob=req.getParameter("dob");
	String address=req.getParameter("address");
	String password=req.getParameter("password");
	String[] language=req.getParameterValues("language");
	
	Myuser user=new Myuser();
	user.setName(name);
	user.setEmail(email);
	user.setMobile(Long.parseLong(mobile));
	user.setGender(gender);
	user.setDob(LocalDate.parse(dob));
	user.setAdress(address);
	user.setPassword(password);
    user.setLanguage(language);
    
    
	
	UserDao dao=new UserDao();
	Myuser myUser=dao.findByEmail(email);
	if(myUser==null)
	{
		dao.save(user);	
		resp.getWriter().print("<h1 style='color:green'>Account Created Successfully</h1>");
		req.getRequestDispatcher("Login.html").include(req, resp);
	}else {
	resp.getWriter().print("<h1 style='color:green'>Email should not be repeated</h1>");
	req.getRequestDispatcher("Signup.html").include(req, resp);
	}
}
}