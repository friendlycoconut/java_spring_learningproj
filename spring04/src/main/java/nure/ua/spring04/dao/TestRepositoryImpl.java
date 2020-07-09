package nure.ua.spring04.dao;

import nure.ua.spring04.model.TestEntity;
import org.springframework.stereotype.Repository;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Repository
public class TestRepositoryImpl implements TestRepository {

    List<TestEntity> people = new ArrayList<TestEntity>();

    @Override
    public TestEntity findById(long id) {
        return null;
    }

    @Override
    public List<TestEntity> input(String filename) throws IOException {

        File file = new File(filename);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = null;
        int index = 0;
        int i = 0;

        while ((line = bufferedReader.readLine()) != null) {
            ArrayList<String> answers = new ArrayList<String>();

            i = i + 1;
            TestEntity question = new TestEntity();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(";");

            while (scanner.hasNext()) {

                String str = scanner.next();
                question.setId(Integer.parseInt(str));

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
