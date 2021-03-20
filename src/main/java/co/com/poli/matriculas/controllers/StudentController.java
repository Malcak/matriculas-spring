package co.com.poli.matriculas.controllers;

import co.com.poli.matriculas.dto.Response;
import co.com.poli.matriculas.entities.Student;
import co.com.poli.matriculas.services.StudentService;
import co.com.poli.matriculas.utilities.ResponseBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    // @Autowired
    private final StudentService studentService;
    private final ResponseBuilder builder;

    @GetMapping()
    public Response findAll(){
        return builder.success(studentService.findAll());
    }

    @GetMapping("/{id}")
    public Response findByStudentID(@PathVariable Long id){
        return builder.success(studentService.findByStudentID(id));
    }

    @PostMapping()
    public Response addStudent(@RequestBody Student student){
        return builder.success(studentService.addStudent(student));
    }

    @DeleteMapping("/{id}")
    public Response deleteStudent(@PathVariable Long id){
        return builder.success(studentService.deleteStudent(id));
    }

    @PutMapping()
    public Response updateStudent(@RequestBody Student student){
        return builder.success(studentService.updateStudent(student));
    }
}
