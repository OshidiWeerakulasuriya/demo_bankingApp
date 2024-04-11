package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public void addNewCustomer(Customer customer){
        //Optional<Customer> customerByName = customerRepository.findCustomerByName(customer.getName());

        System.out.println(customer);
        customerRepository.save(customer);
    }
}
