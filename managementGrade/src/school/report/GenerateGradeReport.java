package school.report;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import util.Define;

import java.util.ArrayList;

public class GenerateGradeReport {
    School school = School.getInstance();
    public static final String TITLE = " 수강생 학점 \n";
    public static final String HEADER = " 이름\t| 학번 |중점과목|  점수 \n";
    public static final String LINE = "-----------------------------\n";
    private StringBuffer buffer = new StringBuffer();

    public String getReport() {
        for (Subject subject:school.getSubjectList()) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString();
    }

    public void makeHeader(Subject subject) {
        buffer.append(LINE);
        buffer.append(subject.getSubjectName());
        buffer.append(TITLE);
        buffer.append(HEADER);
        buffer.append(LINE);
    }

    public void makeBody(Subject subject) {
        ArrayList<Student> studentList = subject.getStudentList();

        for (int i=0; i<studentList.size(); i++) {
            Student student = studentList.get(i);

            buffer.append(student.getStudentName());
            buffer.append("\t|");
            buffer.append(student.getStudentId());
            buffer.append("|");
            buffer.append(student.getMajor().getSubjectName());
            buffer.append("\t|");

            getScoreGrade(student,subject);
            buffer.append("\n");
            buffer.append(LINE);
        }
    }

    public void getScoreGrade(Student student, Subject subject) {
        ArrayList<Score> scoresList = student.getScoreList();
        int majorId = student.getMajor().getSubjectId();

        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(),new MajorEvaluation(),new PassFailEvaluation()};

        for(int i=0; i<scoresList.size(); i++) {
            Score score = scoresList.get(i);

            if(score.getSubject().getSubjectId() == subject.getSubjectId()) {
                String grade;

                if (subject.getGradeType() == Define.PF_TYPE) {
                    grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
                } else {
                    if (score.getSubject().getSubjectId() == majorId) {
                        grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
                    } else {
                        grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
                    }
                }

                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append("|");
            }
        }
    }

    public void makeFooter() {
        buffer.append("\n");
    }
}