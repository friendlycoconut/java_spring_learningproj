package nure.ua.spring02.service;

import nure.ua.spring02.domain.TestReal;

import java.io.IOException;
import java.util.ArrayList;


public interface TestService {
    TestReal getById(long id);
    ArrayList<TestReal> input(String filename) throws IOException;
    void countTest(ArrayList<TestReal> questionsList) throws IOException;
}
