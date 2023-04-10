package in.enterprise.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.enterprise.model.Employee;
import in.enterprise.util.HibernateUtil;

public class Update {

	public static void main(String[] args) {
	Session session=null;
	Transaction transaction=null;
	boolean flag=false;
	
	try
	{
		session=HibernateUtil.getSession();
		if(session!=null) {
			transaction=session.beginTransaction();
			if(transaction!=null)
			{
				Employee employee = new Employee();
				employee.setEmployeeName("Ravikumar");
				employee.setEmployeeSalary(333.25);
				employee.setEmployeId(2);
				session.saveOrUpdate(employee);
				flag=true;
			}
		}
	}
	catch(HibernateException e)
	{
		e.printStackTrace();
	}
	finally
	{
		if(flag=true)
		{
			transaction.commit();
			System.out.println("record updated successfully in the database");
		}
		else
		{
			transaction.rollback();
			System.out.println("Problem in updation");
		}
		HibernateUtil.closeSession(session);
	}
	}
}
