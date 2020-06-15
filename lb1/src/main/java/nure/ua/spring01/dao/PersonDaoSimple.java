package nure.ua.spring01.dao;

import nure.ua.spring01.domain.Person;

public class PersonDaoSimple implements  PersonDao {
    public Person findByName(String name) {
        return new Person(name, 20);
    }
}
