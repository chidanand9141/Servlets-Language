<%@page import="dto.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Home</title>
	<style type="text/css">
		body {
			background-image:
				url("https://img.freepik.com/free-vector/hand-painted-watercolor-pastel-sky-background_23-2148902771.jpg");
			background-size: cover;
		}
	</style>
</head>

<body>
<% 
List<Task> tasks=(List<Task>) request.getAttribute("list");
%>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Task Name</th>
			<th>Description</th>
			<th>Task Date</th>
			<th>Task Completion Date</th>
			<th>Status</th>
			<th>Change Status</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%
		for(Task t:tasks)
		{%>
			<tr>
			<td><%=t.getId()%></td>
			<td><%=t.getName()%></td>
			<td><%=t.getDescription() %></td>
			<td><%=t.getTaskDate() %></td>
			<td><%=t.getCompletiondate()%></td>
			<td><%if(t.isStatus())%>Completed<% else%> not Completed</td>
			<td><button>Change</button></td>
			<td><button>Delete</button></td>
			<td><button>Update</button></td>
		</tr>
		<% 
		}
		%>
	

	</table>
	<br>
	<br>
	<a href="Addtask.html"><button style="margin-left: 20px">Add
			Task</button></a>
	<a href="Login.html"><button style="margin-left: 500px">Logout</button></a>
</body>

</html>