package nure.ua.spring02.dao;

import nure.ua.spring02.domain.Person;

public interface PersonDao {
    Person findByName(String name);
}
