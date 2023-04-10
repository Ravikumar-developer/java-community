package in.enterprise.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.enterprise.model.Employee;
import in.enterprise.util.HibernateUtil;

public class Select {

	public static void main(String[] args) {
		Session session=null;
		Employee employee=null;
		Integer id=1;
		try {
			session=HibernateUtil.getSession();
			if(session!=null)
			{
				employee=session.load(Employee.class,id);
				System.out.println(employee);
			}
		}
		catch(HibernateException e)
		{
			System.out.println("Record not found for given id :: "+id);
		}
	}

}
