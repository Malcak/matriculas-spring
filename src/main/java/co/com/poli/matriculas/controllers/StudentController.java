package co.com.poli.matriculas.controllers;

import co.com.poli.matriculas.entities.Student;
import co.com.poli.matriculas.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PostMapping()
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
