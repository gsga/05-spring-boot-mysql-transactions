package tup.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// @Entity annotation peforms mapping the Student class with the student_info table.
@Entity
// @Table annotation allows overriding the name of the table from student to
// student_info.
@Table(name = "StudentInfo")
public class Student {

    // @Id annotations helps to mark an attribute as a primary key.
    @Id
    int studentId;
    String studentName;
    int studentAge;

    public Student() {
        super();
    }

    public Student(int studentId, String studentName, int studentAge) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
    }

}
