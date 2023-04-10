package in.enterprise.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.enterprise.model.Employee;
import in.enterprise.util.HibernateUtil;

public class Insert {

	public static void main(String[] args) {
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		try 
		{
			session=HibernateUtil.getSession();
			if(session!=null)
			{
				transaction=session.beginTransaction();
				if(transaction!=null)
				{
					Employee employee=new Employee();
					employee.setEmployeeName("nalini");
					employee.setEmployeeSalary(55.09);
					employee.setEmployeId(6);
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
			if (flag=true)
			{
				transaction.commit();
			}
			else {
				transaction.rollback();
				HibernateUtil.closeSession(session);
			}
		}

	}

}
