package com.zili.myproject.systemManager.controller;

import com.zili.myproject.systemManager.domain.Employee;
import com.zili.myproject.systemManager.domain.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @ResponseBody
    @RequestMapping("queryAll")
    public List<Employee> queryAll(){
        return employeeRepository.findAll();
    }

}
