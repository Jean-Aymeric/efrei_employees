package com.efrei.efreiemployees.service;

import com.efrei.efreiemployees.dto.EmployeeMapper;
import com.efrei.efreiemployees.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(final EmployeeRepository employeeRepository, final EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }
}
