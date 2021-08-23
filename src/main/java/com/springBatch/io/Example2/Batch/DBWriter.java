package com.springBatch.io.Example2.Batch;

import com.springBatch.io.Example2.Person.Person;
import com.springBatch.io.Example2.PersonRepo.PersonDao;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Person> {

    @Autowired
    private PersonDao personDao;


    @Override
    public void write(List<? extends Person> list) throws Exception {
        personDao.saveAll(list);
    }
}
