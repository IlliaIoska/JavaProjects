/**
 * @PersonController represents the API layer of the application, which sends CRUD requests to the DB
 */

package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAll() {
        return personService.getAll();
    }

    @PostMapping
    public void registerPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping(path="{personId}")
    public Person getPerson(@PathVariable("personId") Long personId) {
        return personService.getPerson(personId);
    }
}
