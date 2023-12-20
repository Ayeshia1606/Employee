package com.ayeshiat.employeemgrserver.domain.core.employee.services;

import com.ayeshiat.employeemgrserver.domain.core.employee.models.Employee;
import com.ayeshiat.employeemgrserver.domain.core.exceptions.ResourceCreationsException;
import com.ayeshiat.employeemgrserver.domain.core.exceptions.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeService  {
    Employee create (Employee employee) throws ResourceCreationsException;
    Employee getById (Long id) throws ResourceCreationsException;
    Employee getByEmail (String email) throws ResourceNotFoundException;
    List<Employee> getAll();
    Employee update (Long id, Employee employeeDetail) throws  ResourceNotFoundException;
    void delete (Long id);

}
