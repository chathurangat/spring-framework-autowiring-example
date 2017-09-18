package com.springbootdev.autowiring.example.controller;

import com.springbootdev.autowiring.example.service.EmployeeService;
import com.springbootdev.autowiring.example.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.inject.Inject;

@RestController
public class SampleRestApiController {

    @Autowired
    private SampleService sampleService1;

    @Resource
    private SampleService sampleService2;

    @Inject
    private SampleService sampleService3;

    @Autowired
    @Qualifier("permanentEmployeeService")
    private EmployeeService employeeService;

    @GetMapping("/autowired")
    public String invokeAutowiredExample() {
        return sampleService1.getMessage("@Autowired");
    }

    @GetMapping("/resource")
    public String invokeResourceExample() {
        return sampleService2.getMessage("@Resource");
    }

    @GetMapping("/inject")
    public String invokeInjectExample() {
        return sampleService3.getMessage("@Inject");
    }
}
