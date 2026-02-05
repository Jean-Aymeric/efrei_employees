package com.efrei.efreiemployees.service;

import com.efrei.efreiemployees.dto.DepartmentDTO;
import com.efrei.efreiemployees.dto.DepartmentMapper;
import com.efrei.efreiemployees.entity.Department;
import com.efrei.efreiemployees.repository.DepartmentRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService implements IDepartmentService {
    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    public DepartmentService(final DepartmentRepository departmentRepository,
                             final DepartmentMapper departmentMapper) {
        this.departmentRepository = departmentRepository;
        this.departmentMapper = departmentMapper;
    }

    @Override
    public @NotNull List<DepartmentDTO> getAllDepartmentsDTO() {
        return this.getAllDepartments().stream()
                .map(this.departmentMapper::map)
                .toList();
    }

    @NotNull
    private List<Department> getAllDepartments() {
        return this.departmentRepository.findAll();
    }

    @Override
    public @NotNull DepartmentDTO getDepartmentDTOById(final String deptNo) {
        return this.getDepartmentById(deptNo)
                .map(this.departmentMapper::map)
                .orElseThrow(() -> new IllegalArgumentException("Department not found with id: " + deptNo));
    }

    @NotNull
    private Optional<Department> getDepartmentById(final String deptNo) {
        return this.departmentRepository.findById(deptNo);
    }
}
