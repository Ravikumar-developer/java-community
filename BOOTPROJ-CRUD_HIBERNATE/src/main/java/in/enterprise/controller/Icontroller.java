package in.enterprise.controller;

import in.enterprise.bo.Employee;

public interface Icontroller {
	String save(Employee employee);// Creating a record
	Employee findById(Integer sid);// Reading a record
	String updateById(Employee employee);// Updating a record
	String deleteById(Integer sid);// Deleting a record
}
