package tech.codegrill.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.codegrill.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
