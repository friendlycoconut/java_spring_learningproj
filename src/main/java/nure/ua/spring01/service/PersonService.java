package nure.ua.spring01.service;

import nure.ua.spring01.domain.Person;

public interface PersonService {
    Person getByName(String name);
}
