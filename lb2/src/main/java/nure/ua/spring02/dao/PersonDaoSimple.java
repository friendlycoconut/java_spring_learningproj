package nure.ua.spring02.dao;

import nure.ua.spring02.domain.Person;

public class PersonDaoSimple implements PersonDao {
    @Override
    public Person findByName(String name) {
        return new Person(name, 20);
    }
}
