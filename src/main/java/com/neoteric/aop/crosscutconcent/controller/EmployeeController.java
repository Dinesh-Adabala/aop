package com.neoteric.aop.crosscutconcent.controller;

import com.neoteric.aop.crosscutconcent.model.Employee;
import com.neoteric.aop.crosscutconcent.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public Employee save(@RequestBody Employee employee){
        return employeeService;
    }

    public Employee findById(@PathVariable(value = "id") Integer id){
        return employeeService.findById(id);
    }
}
