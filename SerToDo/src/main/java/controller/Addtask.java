package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.Myuser;
import dto.Task;

@WebServlet("/Addtask")
public class Addtask extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String des=req.getParameter("description");
	int days=Integer.parseInt(req.getParameter("days"));
	
	Task t=new Task();
	t.setName(name);
	t.setDescription(des);
	t.setTaskDate(LocalDate.now());
	t.setCompletiondate(LocalDate.now().plusDays(days));
	
	
	UserDao dao=new UserDao();
	dao.save(t);
	
	Myuser myuser=(Myuser)req.getSession().getAttribute("user");
	List<Task> list=new ArrayList<Task>();
	if(list==null)
		list=new ArrayList<Task>();
	list.add(t);
    myuser.setT(list);
	
   dao.update(myuser);
    
	resp.getWriter().print("<h1>Task added successfully</h1>");
	req.setAttribute("list", myuser.getT());
	req.getRequestDispatcher("Home.jsp").include(req, resp);
}
} 