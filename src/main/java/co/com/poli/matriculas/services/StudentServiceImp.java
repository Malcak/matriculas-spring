package co.com.poli.matriculas.services;

import co.com.poli.matriculas.data.StudentData;
import co.com.poli.matriculas.entities.Student;
import co.com.poli.matriculas.repository.StudentInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentInt studentInt;

    @Override
    public List<Student> findAll() {
        return studentInt.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        if (!StudentData.getStudents().contains(student)) {
            return studentInt.addStudent(student);
        }
        return null;
    }

    @Override
    public Student findByStudentID(Long id) {
        return studentInt.findByStudentID(id);
    }

    @Override
    public Student deleteStudent(Long id) {
        return studentInt.deleteStudent(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentInt.updateStudent(student);
    }
}
