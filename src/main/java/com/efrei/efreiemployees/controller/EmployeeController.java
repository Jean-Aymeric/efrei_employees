package com.efrei.efreiemployees.controller;

import com.efrei.efreiemployees.service.IEmployeeService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final IEmployeeService employeeService;

    public EmployeeController(final IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
