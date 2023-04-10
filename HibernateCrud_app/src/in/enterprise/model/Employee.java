package in.enterprise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@Column(name="SID")
	private Integer employeId;
	@Column(name="NAME")
	private String employeeName;
	@Column(name="SALARY")
	private Double employeeSalary;	
	public Integer getEmployeId() {
		return employeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeId(Integer employeId) {
		this.employeId = employeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeId=" + employeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
}
