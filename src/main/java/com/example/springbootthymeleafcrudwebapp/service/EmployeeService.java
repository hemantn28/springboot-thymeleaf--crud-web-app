package com.example.springbootthymeleafcrudwebapp.service;

import com.example.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    void deleteEmployeeById(Integer id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);



}





