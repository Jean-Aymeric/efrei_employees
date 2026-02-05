package com.efrei.efreiemployees.dto;

import com.efrei.efreiemployees.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mapping(target = "id", source = "employee.id")
    @Mapping(target = "firstName", source = "employee.firstName")
    @Mapping(target = "lastName", source = "employee.lastName")
    @Mapping(target = "gender", source = "employee.gender")
    @Mapping(target = "hireDate", source = "employee.hireDate")
    @Mapping(target = "managerDeptNo", source = "employee.departmentManager.deptNo")
    @Mapping(target = "deptNo", source = "employee.department.deptNo")
    @Mapping(target = "salary", source = "employee.salary")
    @Mapping(target = "title", source = "employee.title")
    EmployeeDTO map(Employee employee);
}
