package com.springBatch.io.Example2.PersonRepo;


import com.springBatch.io.Example2.Person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Integer> {
}
