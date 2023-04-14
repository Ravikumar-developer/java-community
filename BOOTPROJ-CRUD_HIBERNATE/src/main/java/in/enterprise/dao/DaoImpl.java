package in.enterprise.dao;
import javax.sql.DataSource;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import in.enterprise.bo.Employee;
import in.hibernate.util.HibernateUtil;
@Repository("dao")
public class DaoImpl implements Idao {

	@Autowired
	private DataSource dataSource;
	Employee employee;
	Session session=HibernateUtil.getSession();
	Transaction transaction=null;
	@Override
	public String save(Employee employee) {
		String status=null;
		boolean flag=false;
		try{
			if(session!=null)
			 {
				transaction=session.beginTransaction();
				 if(transaction!=null){
					session.saveOrUpdate(employee);
					flag=true;
				 }
			 }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(flag){
				transaction.commit();
				status="success";
			}
			else{
				transaction.rollback();
				status="failure";
			}
		}
		return status;
	}
	@Override
	public Employee findById(Integer id) {
		employee=session.get(Employee.class, id);
		return employee;
	}
	@Override
	public String updateById(Employee employee) {
		String status=null;
		boolean flag=false;
		try
		{
			if(session!=null) {
				transaction=session.beginTransaction();
				if(transaction!=null)
				{
					session.saveOrUpdate(employee);
					flag=true;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (flag) {
				transaction.commit();
				status = "success";
			} else {
				transaction.rollback();
				status = "failure";
			}
		}
		return status;
	}
	@Override
	public String deleteById(Integer id) {
		String status=null;
		boolean flag=false;
		try
		{
			if(session==null)
			{
				session=HibernateUtil.getSession();
				if(session!=null)
				{
					transaction=session.beginTransaction();
					if(transaction!=null)
					{
						employee=new Employee();
						employee=session.get(Employee.class, id);
						if(employee!=null)
						{
							session.delete(employee);
							flag=true;
						}
						else
						{
							System.out.println("no record found for id : "+id);
						}
					}
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(flag)
			{
				transaction.commit();
				status="success";
			}
			else
			{
				status="failure";
			}
		}
		return status;
	}

	

}
