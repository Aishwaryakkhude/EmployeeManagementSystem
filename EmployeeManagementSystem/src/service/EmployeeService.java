package service;

import bean.Employee;

public interface EmployeeService 
{
	public void addEmployee(Employee e);
	public void updateEmployee();
	public void deleteEmployee();
	public void findAllEmployee();

}
