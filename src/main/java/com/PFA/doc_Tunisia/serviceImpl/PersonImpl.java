package com.PFA.doc_Tunisia.serviceImpl;

import com.PFA.doc_Tunisia.model.Person;
import com.PFA.doc_Tunisia.repository.PersonRepository;
import com.PFA.doc_Tunisia.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public Person addPerson(Person person) {
        personRepository.save(person);
        return person;
    }
}
