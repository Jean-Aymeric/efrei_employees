package com.efrei.efreiemployees.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.Immutable;

import java.util.Set;

@Entity
@Table(name = "efrei01_departments")
@Immutable
@Getter
public class Department {
    @Id
    @Column(name = "dept_no", nullable = false, length = 4)
    private String deptNo;

    @Column(name = "dept_name", nullable = false, length = 40)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    private Set<Employee> employees;

    @OneToOne(optional = false)
    @JoinColumn(name = "emp_no", nullable = false)
    private Employee manager;
}
