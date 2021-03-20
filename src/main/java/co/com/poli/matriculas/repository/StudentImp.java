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

    @Override
    public Student findByStudentID(Long id) {
        return StudentData.getStudents().get(StudentData.getStudents().indexOf(new Student(id)));
    }

    @Override
    public Student deleteStudent(Long id) {
        Student student = findByStudentID(id);
        StudentData.getStudents().remove(StudentData.getStudents().indexOf(student));
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        StudentData.getStudents().set(StudentData.getStudents().indexOf(student), student);
        return null;
    }

}
