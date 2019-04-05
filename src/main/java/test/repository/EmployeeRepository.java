package test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.model.Employee;
import org.springframework.stereotype.Repository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
