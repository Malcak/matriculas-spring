package co.com.poli.matriculas.services;

import co.com.poli.matriculas.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student addStudent(Student student);
    Student findByStudentID(Long id);
    Student deleteStudent(Long id);
    Student updateStudent(Student student);
}
