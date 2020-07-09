package nure.ua.spring04.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TestEntity {
    @Id
    @GeneratedValue
    private int id;

    private String testName;
    @ElementCollection
    private List<String> answers;
    private int correctAnswer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
