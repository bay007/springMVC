package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;
import com.example.demo.model.Customer;


@RestController
@RequestMapping(path="/user")
public class CustomerController{
	
	@Autowired
	private CustomerService customerService;
   
	@PostMapping(value= {"/customer"})
    public Customer saveUser(@RequestBody Customer customer){
          return customerService.save(customer);
    }
	
	@GetMapping("/customer/{id}")
    public Customer getUser(@PathVariable Integer id){
          return customerService.findOne(id);
    }
}