package in.enterprise.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.enterprise.bo.Employee;
import in.enterprise.dao.Idao;
@Service("service")
public class ServiceImpl implements Iservice {

	@Autowired
	private Idao dao;
	Employee employee;
	
	@Override
	public String save(Employee employee) {
		System.out.println("in service");
		return dao.save(employee);
	}
	@Override
	public Employee findById(Integer id) {
		return dao.findById(id);
	}
	@Override
	public String updateById(Employee employee) {
		return dao.updateById(employee);
	}
	@Override
	public String deleteById(Integer id) {
		return dao.deleteById(id);
	}

}
