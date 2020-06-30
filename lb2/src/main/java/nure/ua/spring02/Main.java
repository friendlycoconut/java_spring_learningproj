package nure.ua.spring02;

import nure.ua.spring02.domain.Person;
import nure.ua.spring02.domain.TestReal;
import nure.ua.spring02.service.PersonService;
import nure.ua.spring02.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\IdeaProjects\\Java_Spring_learningProj\\lb1\\src\\main\\java\\nure\\ua\\spring01\\book.csv";
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        PersonService s = context.getBean(PersonService.class);
        Person ivan = s.getByName("Ivan");

        TestService t = context.getBean(TestService.class);
        ArrayList<TestReal> questions;
        questions = t.input(path);
        t.countTest(questions);


    }
}
