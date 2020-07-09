package nure.ua.spring04.service;

import nure.ua.spring04.dao.TestRepository;
import nure.ua.spring04.model.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

@Service
public class TestServiceImpl implements  TestService {
    private TestRepository dao;

    @Autowired
    private MessageSource messageSource;

    public TestServiceImpl(TestRepository dao) {
        this.dao = dao;
    }
    public TestEntity getById(long id) {
        return null;
    }


    public List<TestEntity> input(String filename) throws IOException {
        return dao.input(filename);
    }


    public void countTest(List<TestEntity> questionsList, String username) throws IOException {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        //System.out.println(messageSource.getMessage("test.welcomeMessage", null, Locale.GERMAN));
        int score = 0;

        for (TestEntity question : questionsList) {
            System.out.println(question.getTestName());
            System.out.println(question.getAnswers());
            //System.out.println(messageSource.getMessage("test.testMessage", null, Locale.GERMAN));
            int userAnswer = myObj.nextInt();
            if (userAnswer == question.getCorrectAnswer())
            {score++;
            }
            else {
                System.out.println( question.getCorrectAnswer());
            }
        }

        System.out.println(username + score);

    }


}
