package nure.ua.spring01.domain;

import java.util.ArrayList;

public class TestReal {
    private static final long serialVersionUID = 1L;
    private int uid;
    private String testName;


    private ArrayList<String> answers;
    private int correctAnswer;
    private int score;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
    public ArrayList<String> getAnswers() {
        return answers;
    }


    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
