package com.efrei.efreiemployees.controller;

import com.efrei.efreiemployees.dto.EmployeeDTO;
import com.efrei.efreiemployees.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(final EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
