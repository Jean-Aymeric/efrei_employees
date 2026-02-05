package com.efrei.efreiemployees.service;

import com.efrei.efreiemployees.dto.DepartmentDTO;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public interface IDepartmentService {
    @NotNull
    List<DepartmentDTO> getAllDepartmentsDTO();

    @NotNull
    DepartmentDTO getDepartmentDTOById(String deptNo);
}
