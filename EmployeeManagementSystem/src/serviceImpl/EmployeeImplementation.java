package serviceImpl;

import java.util.ArrayList;
import java.util.List;

import bean.Employee;
import service.EmployeeService;

public class EmployeeImplementation  implements EmployeeService
{

	@Override
	public void addEmployee(Employee e) 
	{
        List<Employee>list=new ArrayList<Employee>();
        list.add(e);
        list.forEach(n->System.out.println(n));
        
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
