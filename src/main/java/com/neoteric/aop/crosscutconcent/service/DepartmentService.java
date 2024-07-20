package com.neoteric.aop.crosscutconcent.service;

import com.neoteric.aop.crosscutconcent.annotation.AdsAnnotation;
import com.neoteric.aop.crosscutconcent.model.Department;
import com.neoteric.aop.crosscutconcent.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department ){
        return departmentRepository.save(department);
    }

    @AdsAnnotation
    public Department findById(Integer id ){
        return departmentRepository.findById(id).orElse(null);
    }
}
