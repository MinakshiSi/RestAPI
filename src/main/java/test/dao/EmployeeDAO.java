package test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.model.Employee;
import test.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*To save an employee*/
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	/*Search all employee*/
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	/*Get an employee by id*/
	
	public Employee findOne(Long empid) {
		return employeeRepository.findById(empid).orElse(null);
	}
	
	/*Delete an employee*/
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}
