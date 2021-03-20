package co.com.poli.matriculas.repository;

import co.com.poli.matriculas.data.StudentData;
import co.com.poli.matriculas.entities.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentImp implements StudentInt {
    @Override
    public List<Student> findAll() {
        return StudentData.getStudents();
    }

    @Override
    public Student addStudent(Student student) {
        List<Student> students = StudentData.getStudents();
        students.add(student);
        StudentData.setStudents(students);
        return student;
    }
}
