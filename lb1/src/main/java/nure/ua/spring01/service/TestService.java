package nure.ua.spring01.service;

import nure.ua.spring01.domain.Person;
import nure.ua.spring01.domain.TestReal;

import java.io.IOException;
import java.util.ArrayList;

public interface TestService {
    TestReal getById(long id);
    ArrayList<TestReal> input(String filename) throws IOException;
}
