package nure.ua.spring01;

import nure.ua.spring01.domain.Person;
import nure.ua.spring01.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/my-context.xml");
        PersonService s = context.getBean(PersonService.class);
        Person ivan = s.getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}
