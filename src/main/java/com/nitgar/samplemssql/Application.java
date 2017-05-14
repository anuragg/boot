package com.nitgar.samplemssql;

import com.nitgar.samplemssql.entity.Person;
import com.nitgar.samplemssql.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by avnitagupta on 13/05/17.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    public CommandLineRunner demo(PersonRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Person("Jack", "Bauer"));
            repository.save(new Person("Chloe", "O'Brian"));
            repository.save(new Person("Kim", "Bauer"));
            repository.save(new Person("David", "Palmer"));
            repository.save(new Person("Michelle", "Dessler"));

            // fetch all customers
            System.out.println("Customers found with findAll():");
            System.out.println("-------------------------------");
            for (Person customer : repository.findAll()) {
                System.out.println(customer.toString());
            }
            System.out.println("");

            // fetch an individual customer by ID
            Person customer = repository.findOne(1L);
            System.out.println("Customer found with findOne(1L):");
            System.out.println("--------------------------------");
            System.out.println(customer.toString());
            System.out.println("");

            // fetch customers by last name
            System.out.println("Customer found with findByLastName('Bauer'):");
            System.out.println("--------------------------------------------");
            for (Person bauer : repository.findByLastName("Bauer")) {
                System.out.println(bauer.toString());
            }
            System.out.println("");
        };
    }
}
