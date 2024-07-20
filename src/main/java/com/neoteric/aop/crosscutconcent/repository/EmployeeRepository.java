package com.neoteric.aop.crosscutconcent.repository;

import com.neoteric.aop.crosscutconcent.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee ,Integer> {
}
