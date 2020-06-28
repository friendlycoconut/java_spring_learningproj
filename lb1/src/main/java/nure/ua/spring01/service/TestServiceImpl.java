package nure.ua.spring01.service;

import nure.ua.spring01.dao.PersonDao;
import nure.ua.spring01.dao.TestDao;
import nure.ua.spring01.domain.Person;
import nure.ua.spring01.domain.TestReal;

import java.io.IOException;
import java.util.ArrayList;

public class TestServiceImpl implements TestService {
    private TestDao dao;


    public TestServiceImpl(TestDao dao) {
        this.dao = dao;
    }

    public TestReal getById(long name) {
        return dao.findById(name);
    }


    public ArrayList<TestReal> input(String filename) throws IOException {
        return dao.input(filename);
    }


}
