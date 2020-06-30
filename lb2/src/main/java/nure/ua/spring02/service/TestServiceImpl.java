package nure.ua.spring02.service;

import nure.ua.spring02.dao.TestDao;
import nure.ua.spring02.domain.TestReal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class TestServiceImpl implements TestService {
    private TestDao dao;

    @Autowired
    private MessageSource messageSource;


    public TestServiceImpl(TestDao dao) {
        this.dao = dao;
    }

    public TestReal getById(long name) {
        return dao.findById(name);
    }


    public ArrayList<TestReal> input(String filename) throws IOException {
        return dao.input(filename);
    }

    @Override
    public void countTest(ArrayList<TestReal> questionsList) throws IOException {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println(messageSource.getMessage("test.welcomeMessage", null, Locale.GERMAN));
        String userName = myObj.nextLine();  // Read user input
        int score = 0;

        for (TestReal question : questionsList) {
            System.out.println(question.getTestName());
            System.out.println(question.getAnswers());
            System.out.println(messageSource.getMessage("test.testMessage", null, Locale.GERMAN));
            int userAnswer = myObj.nextInt();
            if (userAnswer == question.getCorrectAnswer())
            {score++;
            }
            else {
                System.out.println(messageSource.getMessage("test.correctAns", null, Locale.GERMAN) + question.getCorrectAnswer());
            }
        }

        System.out.println(userName +  messageSource.getMessage("test.scoreMessage", null, Locale.GERMAN)+ score);

    }
}
