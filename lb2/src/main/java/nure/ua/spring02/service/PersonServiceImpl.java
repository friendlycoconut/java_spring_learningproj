package nure.ua.spring02.service;

import nure.ua.spring02.dao.PersonDao;
import nure.ua.spring02.domain.Person;

public class PersonServiceImpl implements PersonService {
    private PersonDao dao;

    public PersonServiceImpl(PersonDao dao){ this.dao = dao;}
    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
