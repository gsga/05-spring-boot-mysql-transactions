package tup.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tup.demo.models.Student;
import tup.demo.services.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/retrieve")
    public List<Student> retrieve() {
        List<Student> studentList = studentService.retrieve();
        return studentList;
    }

    @PostMapping("/insert")
    public String insert(@RequestBody Student student) {
        if (student == null) {
            return "Failed to insert student in the database";
        } else {
            String result = studentService.insert(student);
            return result;
        }
    }

    @DeleteMapping("/delete")
    public String delete(int studentId) {
        String result = studentService.delete(studentId);
        return result;
    }
}