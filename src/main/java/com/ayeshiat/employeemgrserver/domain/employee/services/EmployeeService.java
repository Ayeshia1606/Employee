package com.ayeshiat.employeemgrserver.domain.employee.services;

import com.ayeshiat.employeemgrserver.domain.employee.models.Employee;
import com.ayeshiat.employeemgrserver.domain.core.exceptions.ResourceCreationException;
import com.ayeshiat.employeemgrserver.domain.core.exceptions.ResourceNotFoundException;


import java.util.List;

public interface EmployeeService  {
    Employee create (Employee employee) throws ResourceCreationException;
    Employee getById (Long id) throws ResourceCreationException;
    Employee getByEmail (String email) throws ResourceNotFoundException;
    List<Employee> getAll();
    Employee update (Long id, Employee employeeDetail) throws  ResourceNotFoundException;
    void delete (Long id);

}
