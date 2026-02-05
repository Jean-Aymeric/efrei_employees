package com.efrei.efreiemployees.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.Immutable;

import java.time.LocalDate;

@Entity
@Table(name = "efrei01_employees")
@Immutable
@Getter
public class Employee {
    @Id
    @Column(name = "emp_no", nullable = false, unique = true)
    private Integer id;

    @Column(name = "first_name", nullable = false, length = 14)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 16)
    private String lastName;

    @Column(name = "gender")
    private Character gender;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dept_no", nullable = false)
    private Department department;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @OneToOne(optional = true)
    @JoinColumn(name = "emp_no", nullable = false)
    private Department departmentManager;
}
