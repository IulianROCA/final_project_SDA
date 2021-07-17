package com.pickUpCar.pickUpCar.service;

import com.pickUpCar.pickUpCar.entity.Person;
import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();
    void savePerson(Person person);
    void deletePersonById(long id);
    Person getPersonById(long id);
}
