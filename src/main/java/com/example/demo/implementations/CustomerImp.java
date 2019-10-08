package com.example.demo.implementations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerImp implements CustomerService{
     @Autowired
     private CustomerRepository customerRepository;
     @Override
     public Boolean saveCustomer(Customer customer) {
          try {
        	  customerRepository.save(customer);
               return true;
          } catch (Exception e) {
               return false;
          }
     }
}