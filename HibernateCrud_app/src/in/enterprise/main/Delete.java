package in.enterprise.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.enterprise.model.Employee;
import in.enterprise.util.HibernateUtil;

public class Delete {

	public static void main(String[] args) {
		Session session=null;
		Transaction transaction=null;
		boolean flag =false;
		
		try
		{
			session=HibernateUtil.getSession();
			if(session!=null)
			{
				transaction=session.beginTransaction();
				if(transaction!=null)
				{
					int id=7;
					Employee employee=session.get(Employee.class,id);
					if(employee!=null)
					{
						session.delete(employee);
						flag=true;
					}
					else
					{
						System.out.println("No record found for the id :: "+id);
					}
				}
			}
		}
		catch(HibernateException e)
		{
		e.printStackTrace();
		flag=false;
		}
		finally
		{
		if(flag=true)
     		{
			transaction.commit();
			System.out.println("record deleted succesfully.");
	     	}
		else
		{
			System.out.println("record deleted failed.");
		}
		HibernateUtil.closeSession(session);
		}
	}
}
