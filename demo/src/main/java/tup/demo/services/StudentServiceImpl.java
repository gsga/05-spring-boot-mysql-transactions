package tup.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tup.demo.models.Student;
import tup.demo.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Transactional
	// A Proxy is Created that wraps the function retrieve
	// BeginTransaction
	public List<Student> retrieve() {
		List<Student> studentList = (List<Student>) studentRepository.findAll();
		return studentList;
	}
	// Commit Transaction

	@Transactional
	// A Proxy is Created that wraps the function insert
	// BeginTransaction
	public String insert(Student student) {
		try {
			// Estamos dentro de una transacción.
			// Notar que el save() se ejecuta en esta línea.
			Student savedStudent = studentRepository.save(student);
			if (savedStudent.getId() == 9) {
				// Si dejamos la división por 10 no hay excepción, y la transacción
				// se comete normalmente.
				// Pero si ponemos una división por cero, se produce una excepción
				// y la transacción se retrotrae, de modo que nada cambia.
				int a = 1 / 10;
				a = 1 / 0;
				System.out.println("The value of A is : " + a);
			}
			return "The student is successfully inserted in the database";
		} catch (IllegalArgumentException e) {
			return "Student parameter must not be null";
		} catch (ArithmeticException e) {
			return "División entera por cero: ArithmeticException.";
		}
		// Commit Transaction
	}

	// @Override
	@Transactional
	// A Proxy is Created that wraps the function delete
	// BeginTransaction
	public String delete(int StudentId) {
		studentRepository.deleteById(StudentId);
		return "The Student is successfully deleted from the database";
	}
	// Commit Transaction

}
