package dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 int id;
 String name;
 String description;
 LocalDate taskDate;
 LocalDate completiondate;
 boolean status;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public LocalDate getTaskDate() {
	return taskDate;
}
public void setTaskDate(LocalDate taskDate) {
	this.taskDate = taskDate;
}
public LocalDate getCompletiondate() {
	return completiondate;
}
public void setCompletiondate(LocalDate completiondate) {
	this.completiondate = completiondate;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
}