package co.com.poli.matriculas.repository;

import co.com.poli.matriculas.entities.Student;

import java.util.List;

public interface StudentInt {
    List<Student> findAll();
    Student addStudent(Student student);
}
