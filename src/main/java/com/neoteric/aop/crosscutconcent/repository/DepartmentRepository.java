package com.neoteric.aop.crosscutconcent.repository;

import com.neoteric.aop.crosscutconcent.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
