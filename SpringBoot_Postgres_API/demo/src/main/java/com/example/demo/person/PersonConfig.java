/**
 * within @PersonConfig Adds two instances of the Person class to the DB
 */

package com.example.demo.person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PersonConfig {
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {
            Person John = new Person("John","Doe");
            Person Bobo = new Person("Bobo", "Dobo");
            personRepository.saveAll(List.of(John, Bobo));
        };
    }
}
