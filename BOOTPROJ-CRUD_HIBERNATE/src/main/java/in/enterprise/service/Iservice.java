package in.enterprise.service;

import in.enterprise.bo.Employee;

public interface Iservice {
	String save(Employee employee);// Creating a record
	Employee findById(Integer sid);// Reading a record
	String updateById(Employee employee);// Updating a record
	String deleteById(Integer sid);// Deleting a record
}
