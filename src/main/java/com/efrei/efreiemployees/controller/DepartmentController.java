package com.efrei.efreiemployees.controller;

import com.efrei.efreiemployees.dto.DepartmentDTO;
import com.efrei.efreiemployees.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(final DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/departments")
    public List<DepartmentDTO> getDepartments() {
        return this.departmentService.getAllDepartmentsDTO();
    }

    @GetMapping("/departmentById")
    public DepartmentDTO getDepartment(@RequestParam(value = "id") String id) {
        return this.departmentService.getDepartmentDTOById(id);
    }
}
