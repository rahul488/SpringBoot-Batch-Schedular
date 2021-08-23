package com.springBatch.io.Example2.Batch;

import com.springBatch.io.Example2.Person.Person;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


@Component
public class Processor implements ItemProcessor<Person,Person> {
    @Override
    public Person process(Person person) throws Exception {
        String firstName=person.getFirstName();
        String lastName=person.getLastName();
        person.setFirstName(firstName.toUpperCase());
        person.setLastName(lastName.toUpperCase());
        return person;
    }
}
