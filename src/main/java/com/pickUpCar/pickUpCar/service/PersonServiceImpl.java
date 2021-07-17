package com.pickUpCar.pickUpCar.service;

import com.pickUpCar.pickUpCar.entity.Person;
import com.pickUpCar.pickUpCar.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() { return this.personRepository.findAll(); }

    @Override
    public void savePerson(Person person) { this.personRepository.save(person); }

    @Override
    public void deletePersonById(long id) { this.personRepository.deleteById(id); }

    @Override
    public Person getPersonById(long id) {
        Optional<Person> optional = personRepository.findById(id);
        Person person = null;
        if(optional.isPresent()){
            person = optional.get();
        }else{
            throw new RuntimeException("Person not found for id ::" + id);
        }
        return person;
    }
}
