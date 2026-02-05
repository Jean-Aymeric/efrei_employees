package com.efrei.efreiemployees.dto;

import com.efrei.efreiemployees.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    @Mapping(target = "deptNo", source = "department.deptNo")
    @Mapping(target = "name", source = "department.name")
    @Mapping(target = "managerId", source = "department.manager.id")
    DepartmentDTO map(Department department);
}
