package objectClass.method;

import java.util.Objects;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return studentNum == student.studentNum && Objects.equals(studentName, student.studentName);
        if (o instanceof Student) {
            Student std = (Student) o;
            return this.studentNum == std.studentNum;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        //return Objects.hash(studentNum, studentName);
        return studentNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
