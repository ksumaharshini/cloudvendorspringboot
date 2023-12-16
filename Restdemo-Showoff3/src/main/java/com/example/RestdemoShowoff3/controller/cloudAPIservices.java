package com.example.RestdemoShowoff3.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestdemoShowoff3.model.cloudvendor;

@RestController
@RequestMapping("/sujatha")
public class cloudAPIservices {
    cloudvendor cv;
    @GetMapping("/{vendorID}")
    public cloudvendor getcloudvendorDetails(String vendorID){
        return cv;
        //return new cloudvendor("E1","suma","thota","8106236220");
    }
    @PostMapping
    public String postcloudvendorDetails(@RequestBody cloudvendor cv){
        this.cv=cv;
        return "cloud vendor added successfully";
    }
    @PutMapping
    public String updatecloudvendorDetails(@RequestBody cloudvendor cv){
        this.cv=cv;
        return "cloud vendor updated successfully";
    }
    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(String vendorID){
        this.cv=null;
        return "cloud vendor deleted successfully";
    }
}
