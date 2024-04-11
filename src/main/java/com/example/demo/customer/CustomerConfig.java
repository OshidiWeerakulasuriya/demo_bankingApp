package com.example.demo.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
        return args -> {
//            Customer alex = new Customer(
//                    "Alex",
//                    LocalDate.of(1999, 8, 23));
//
//            Customer anna = new Customer(
//                    "Anna",
//                    LocalDate.of(1998, 5, 16));
//
//            repository.saveAll(
//                    List.of(alex, anna)
//            );
        };
    }
}
