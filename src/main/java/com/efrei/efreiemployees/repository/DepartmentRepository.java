package com.efrei.efreiemployees.repository;

import com.efrei.efreiemployees.entity.Department;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
    @NotNull
    List<Department> findAll();

    @Override
    Optional<Department> findById(String id);
}

