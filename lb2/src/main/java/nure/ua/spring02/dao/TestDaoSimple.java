package nure.ua.spring02.dao;


import nure.ua.spring02.domain.TestReal;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class TestDaoSimple implements TestDao {

    ArrayList<TestReal> people = new ArrayList<TestReal>();

    public TestReal findById(long id) {
        return null;
    }


    public ArrayList<TestReal> input(String fileName) throws IOException {


        File file = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = null;
        int index = 0;
        int i = 0;

        while ((line = bufferedReader.readLine()) != null) {
            ArrayList<String> answers = new ArrayList<String>();

            i = i + 1;
            TestReal question = new TestReal();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(";");

            while (scanner.hasNext()) {

                String str = scanner.next();
                question.setUid(Integer.parseInt(str));

                str = scanner.next();
                question.setTestName(str);


                String strA1 = scanner.next();

                answers.add(strA1);


                String strA2 = scanner.next();

                answers.add(strA2);


                String strA3 = scanner.next();

                answers.add(strA3);


                question.setAnswers(answers);


                str = scanner.next();
                question.setCorrectAnswer(Integer.parseInt(str));

            }
            people.add(question);
        }
        return people;
    }
}
