package nure.ua.spring01.dao;

import nure.ua.spring01.domain.TestReal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface TestDao {
    TestReal findById(long id);
    ArrayList<TestReal> input(String filename) throws IOException;
}
