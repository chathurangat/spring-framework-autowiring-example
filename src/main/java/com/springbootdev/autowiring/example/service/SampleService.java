package com.springbootdev.autowiring.example.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService
{
    public String getMessage(String annotation)
    {
        return "This method is called using a bean injected with " + annotation;
    }
}
