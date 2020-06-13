package nure.ua.spring01.dao;

import nure.ua.spring01.domain.Person;

public interface PersonDao {
    Person findByName (String name);
}
