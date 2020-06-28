package nure.ua.spring01;

import nure.ua.spring01.domain.Person;
import nure.ua.spring01.domain.TestReal;
import nure.ua.spring01.service.PersonService;
import nure.ua.spring01.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\IdeaProjects\\Java_Spring_learningProj\\lb1\\src\\main\\java\\nure\\ua\\spring01\\book.csv";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/my-context.xml");
        PersonService s = context.getBean(PersonService.class);
        Person ivan = s.getByName("Ivan");
        //System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());

        TestService t = context.getBean(TestService.class);
        ArrayList<TestReal> questions;
        questions = t.input(path);


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // Read user input
        int score = 0;

        for (TestReal question : questions) {
            System.out.println(question.getTestName());
            System.out.println(question.getAnswers());
            System.out.println("Please input number of correct answer");
            int userAnswer = myObj.nextInt();
            if (userAnswer == question.getCorrectAnswer())
                {score = score+1;
        }
            else {
                System.out.println("Correct ans: " + question.getCorrectAnswer());
            }
        }

        System.out.println(userName + ", your score: " + score);




    }
}
