package in.enterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.enterprise.bo.Employee;
import in.enterprise.service.Iservice;
@Controller("controller")
public class ControllerImpl implements Icontroller{

	@Autowired
	private Iservice service;
	Employee employee;
	
	@Override
	public String save(Employee employee) {
		System.out.println("in controller");
		return service.save(employee);
	}
	@Override
	public Employee findById(Integer id) {
		return service.findById(id);
	}
	@Override
	public String updateById(Employee employee) {
		return service.updateById(employee);
	}
	@Override
	public String deleteById(Integer id) {
		return service.deleteById(id);
	}	
}
