package com.efrei.efreiemployees.dto;

import java.time.LocalDate;

public record EmployeeDTO(
        Integer id,
        String firstName,
        String lastName,
        Character gender,
        LocalDate hireDate,
        String deptNo,
        Integer salary,
        String title,
        String managerDeptNo
) {
}
