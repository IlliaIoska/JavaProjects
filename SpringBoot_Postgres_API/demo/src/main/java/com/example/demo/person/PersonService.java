/**
 * @PersonService Class represents the interactions of the service layer of the application with the Data Access Layer
 */

package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public void addPerson(Person person) {
        Optional<Person> searchedPerson = personRepository.findPersonByFirstName(person.getFirstName());
        if(searchedPerson.isPresent()) {
            throw new IllegalStateException("already exists");
        } else {
            personRepository.save(person);
        }
    }

    public Person getPerson(Long personId) {
        boolean exists = personRepository.existsById(String.valueOf(personId));
        if(!exists) {
            throw new IllegalStateException("Student with id " + personId + " has not been found");
        }
        return personRepository.findPersonById(personId);
    }
}
