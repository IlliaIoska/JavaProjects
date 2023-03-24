/**
 * @PersonRepository Describes the functionality of the Data Access layer, or how the Application interacts with the Postgres Database
 */

package com.example.demo.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {
    @Query("SELECT p FROM Person p WHERE p.firstName = ?1")
    Optional<Person> findPersonByFirstName(String firstName);

    @Query("SELECT p FROM Person p WHERE p.id = :id")
    Person findPersonById(Long id);
}
