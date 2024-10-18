package com.restdemo.rest_demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.restdemo.rest_demo.models.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CloudVendorApiService {

    @GetMapping("/")
    public String getMethodName() {
        return new String("Welcome to Java Server");
    }
    
    // With parameter and receive the parameter
    @GetMapping("/me/{id}")
    public CloudVendor cloudVendorList(@RequestParam("id") String id) {
        // You can use the 'id' parameter for any logic you want to implement
        return new CloudVendor(id, "Munna", "Munna");
    }
}
