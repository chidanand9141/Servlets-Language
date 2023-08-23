package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Myuser;
import dto.Task;

public class UserDao
{
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public void save(Myuser user)
{
	entityTransaction.begin();
	entityManager.persist(user);
	entityTransaction.commit();
}
public Myuser findByEmail(String email) 
{
	List<Myuser> list=entityManager.createQuery("select x from Myuser x where email=?1").setParameter(1, email).getResultList();
	//cretaeNativeQuerry("select x from myuser where email=",MyUser.class)
	if(list.isEmpty())
	return null;
	else
		return list.get(0);
}
public void save(Task t)
{
	entityTransaction.begin();
	entityManager.persist(t);
	entityTransaction.commit();
}
public List<Task> fetchAllTasks()
{
	return entityManager.createQuery("select x from Task x").getResultList();
}

public void update(Myuser myuser) 
{
	
	entityTransaction.begin();
	entityManager.merge(myuser);
	entityTransaction.commit();
}
}