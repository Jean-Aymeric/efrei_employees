package com.efrei.efreiemployees.repository;

import com.efrei.efreiemployees.entity.Employee;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Override
    @NotNull
    List<Employee> findAll();
}
