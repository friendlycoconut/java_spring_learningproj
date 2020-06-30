package nure.ua.spring02.dao;

import nure.ua.spring02.domain.TestReal;

import java.io.IOException;
import java.util.ArrayList;

public interface TestDao {
    TestReal findById(long id);
    ArrayList<TestReal> input(String filename) throws IOException;
}
