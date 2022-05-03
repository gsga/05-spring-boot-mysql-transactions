package tup.demo.services;

import java.util.List;

import tup.demo.models.Student;

public interface StudentService {

    public List<Student> retrieve();

    public String insert(Student student);

    public String delete(int StudentId);
}
