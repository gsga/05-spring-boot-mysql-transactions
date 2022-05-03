package tup.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tup.demo.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}