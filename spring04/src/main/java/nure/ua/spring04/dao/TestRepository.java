package nure.ua.spring04.dao;

import nure.ua.spring04.model.TestEntity;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface TestRepository  {
    TestEntity findById(long id);
    List<TestEntity> input(String filename) throws IOException;
}
