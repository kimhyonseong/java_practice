package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import util.Define;

public class TestMain {
    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();
        test.createSubject();
        test.createStudent();

        GenerateGradeReport generateGradeReport = new GenerateGradeReport();
        System.out.println(generateGradeReport.getReport());
    }

    public void createSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학",Define.MATH);

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
    }

    public void createStudent() {
        Student s1 = new Student("강감찬",211213,korean);
        Student s2 = new Student("김유신",212330,math);
        Student s3 = new Student("신사임당",201518,korean);
        Student s4 = new Student("이순신",202360,korean);
        Student s5 = new Student("홍길동",201290,math);

        goodSchool.addStudent(s1);
        goodSchool.addStudent(s2);
        goodSchool.addStudent(s3);
        goodSchool.addStudent(s4);
        goodSchool.addStudent(s5);

        korean.resister(s1);
        korean.resister(s2);
        korean.resister(s3);
        korean.resister(s4);
        korean.resister(s5);

        math.resister(s1);
        math.resister(s2);
        math.resister(s3);
        math.resister(s4);
        math.resister(s5);

        addScoreForStudent(s1,korean,95);
        addScoreForStudent(s2,korean,95);
        addScoreForStudent(s3,korean,100);
        addScoreForStudent(s4,korean,89);
        addScoreForStudent(s5,korean,83);

        addScoreForStudent(s1,math,56);
        addScoreForStudent(s2,math,98);
        addScoreForStudent(s3,math,88);
        addScoreForStudent(s4,math,95);
        addScoreForStudent(s5,math,56);
    }

    public void addScoreForStudent(Student student,Subject subject,int point) {
        Score score = new Score(student.getStudentId(),subject,point);
        student.addSubjectScore(score);
    }
}
