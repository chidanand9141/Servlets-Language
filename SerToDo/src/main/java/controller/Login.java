package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.UserDao;
import dto.Myuser;
import dto.Task;
@WebServlet("/login")
public class Login extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
   String email=req.getParameter("email");
   String password=req.getParameter("password");
   
   UserDao dao=new UserDao();
   
   Myuser myuser= dao.findByEmail(email);
   if(myuser==null) 
   {
   resp.getWriter().print("<h1>Email is not correct</h1>");
   req.getRequestDispatcher("login.html").include(req, resp);
   }else {
	   if(myuser.getPassword().equals(password))
	   {
		   req.getSession().setAttribute("user", myuser);
		   resp.getWriter().print("<h1>Login Successfully</h1>");
		   
		   List<Task> list=myuser.getT();
		   req.setAttribute("list", list);
		   
		   req.getRequestDispatcher("Home.jsp").include(req, resp);
		  
   }else {
	   resp.getWriter().print("<h1>Inncorrect Password</h1>");
	   req.getRequestDispatcher("login.html").include(req, resp);
   }
}
}
}