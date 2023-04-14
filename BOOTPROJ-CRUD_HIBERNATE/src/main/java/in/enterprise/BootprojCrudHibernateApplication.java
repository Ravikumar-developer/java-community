package in.enterprise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import in.enterprise.bo.Employee;
import in.enterprise.controller.Icontroller;
@SpringBootApplication
public class BootprojCrudHibernateApplication {
	public static void drawMainMenu()
	{
		System.out.println("\t WELCOME");
		System.out.println("1 	-	TO CREATE");
		System.out.println("2	-	TO READ");
		System.out.println("3	-	TO UPDATE");
		System.out.println("4	-	TO DELETE");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		ApplicationContext context=SpringApplication.run(BootprojCrudHibernateApplication.class, args);
		System.out.println("****container started****");
		Icontroller controller=context.getBean("controller",Icontroller.class);
		System.out.println(controller);
		String name=null,city=null,id=null,age=null,salary=null,status=null;
		Employee employee=new Employee();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner scanner=new Scanner(System.in);
		Integer selection=0;
		
		try
		{
			BootprojCrudHibernateApplication.drawMainMenu();
			System.out.println("CHOOSE YOU OPERATION :");
			selection=Integer.parseInt(br.readLine());
			switch(selection)
			{
			case 1:
				
				System.out.println("enter id:");
				id=br.readLine();
				System.out.println("enter name:");	
				name=br.readLine();
				System.out.println("enter age:");
				age=br.readLine();
				System.out.println("enter city:");
				city=br.readLine();
				System.out.println("enter salary:");
				salary=br.readLine();
				employee.setAge(Integer.parseInt(age));
				employee.setId(Integer.parseInt(id));
				employee.setCity(city);
				employee.setName(name);
				employee.setSalary(Long.parseLong(salary));
				status=controller.save(employee);
				if(status.equalsIgnoreCase("success"))
				{
					System.out.println("RECORD INSERTED SUCCESSFULL");
				}
				else if(status.equalsIgnoreCase("failure"))
					System.out.println("RECORD INSERT FAILLED");
				else
				{
					System.out.println("SOMETHING WENT WRONG");
				}
				break;
			case 2:
				System.out.print("Enter the id:: ");
				id = br.readLine();
				employee = controller.findById(Integer.parseInt(id));
				if (employee != null)
					System.out.println(employee);
				else
					System.out.println("Record not available for the given id ::" + id);
				break;
			case 3:
				System.out.println("enter the id to update:");
				id=br.readLine();
				employee=controller.findById(Integer.parseInt(id));
				
				if(employee!=null)
				{
					System.out.println(employee);
					employee.setId(Integer.parseInt(id));
					
					System.out.println("enter the  new name :");
					String newName=br.readLine();
					if(newName==null||newName==""){
						employee.setName(employee.getName());
					}
					else{
						employee.setName(newName);
					}
					System.out.println("enter the  new age :");
					String newAge=br.readLine();
					if(newAge==null||newAge==""){
						employee.setAge(employee.getAge());
					}
					else{
						employee.setAge(Integer.parseInt(newAge));
					}
					System.out.println("enter the new city :");
					String newCity=br.readLine();
					if(newCity==null||newCity==""){
						employee.setCity(employee.getCity());
					}
					else{
						employee.setCity(newCity);
					}
					System.out.println("enter the new salary :");
					String newSalary=br.readLine();
					if(newSalary==null||newSalary==""){
						employee.setSalary(employee.getSalary());
					}
					else{
						employee.setSalary(Long.parseLong(newSalary));
					}
					 status=controller.updateById(employee);
					if(status.equalsIgnoreCase("success"))
					{
						System.out.println("RECORD UPDATED SUCCESSFULL");
					}
					else if(status.equalsIgnoreCase("failure"))
						System.out.println("RECORD UPDATE FAILLED");
					else
					{
						System.out.println("SOMETHING WENT WRONG");
					}
				}
				else
				{
					System.out.println("RECORD NOT FOUND");
				}
				break;
			case 4:
				System.out.println("enter the id to delete :");
				id=br.readLine();
				status=controller.deleteById(Integer.parseInt(id));
				if(status.equalsIgnoreCase("success"))
				{
					System.out.println("RECORD DELETED");
				}
				else if(status.equalsIgnoreCase("failure")){
					System.out.println("RECORD NOT FOUND");
				}
				else
				{
					System.out.println("SOMETHING WENT WRONG");
				}
				break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}		
 }

