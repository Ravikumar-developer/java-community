package in.enterprise.main;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.enterprise.model.Employee;

public class TestApp {

	public static void main(String[] args) throws IOException {
	
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Employee emp=null;
		emp=session.get(Employee.class, 1);
		System.out.println("old value is "+emp);
		System.in.read();
		session.refresh(emp);
		System.out.println("the new value is "+emp);
		
		session.close();
	}

}
