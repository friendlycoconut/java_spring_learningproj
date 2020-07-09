package nure.ua.spring04.service;

import nure.ua.spring04.model.TestEntity;

import java.io.IOException;
import java.util.List;

public interface TestService {
    TestEntity getById(long id);
    List<TestEntity> input(String filename) throws IOException;
    void countTest(List<TestEntity> questionsList, String username) throws IOException;
}
