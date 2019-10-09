package com.example.demo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository <Customer, String>{
      public List<Customer> findByNombre(String nombre);
      public Customer findById(Integer id);
      
 }