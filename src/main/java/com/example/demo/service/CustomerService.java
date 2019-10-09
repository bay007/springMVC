package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
    CustomerRepository customerRepository;
	
	  public Customer save(Customer customer) {
		  System.out.println(customerRepository.count());
		  System.out.println(customerRepository.findById(1));
		  System.out.println(customerRepository.findByNombre("Jeferson")); 
		  return customerRepository.save(customer);
	  }
	  
	  public Customer findOne(Integer id) {
		 return  customerRepository.findById(id);
	  }
}
