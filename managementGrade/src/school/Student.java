package school;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentId;
    private Subject major;
    private ArrayList<Score> scoreList = new ArrayList<>();

    public Student(){}
    public Student(String name, int num,Subject subject) {
        this.studentName = name;
        this.studentId = num;
        this.major = subject;
    }

    public void addSubject(Score score) {
        scoreList.add(score);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Subject getMajor() {
        return major;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
