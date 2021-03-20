package co.com.poli.matriculas.data;

import co.com.poli.matriculas.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    private static List<Student> students;

    static {
        students = new ArrayList<Student>(){
            {
                add(new Student(10L, "Pedro Perez", Boolean.TRUE));
                add(new Student(20L, "Sara Lopez", Boolean.FALSE));
                add(new Student(30L, "Juan Arboleda", Boolean.TRUE));
            }
        };
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        StudentData.students = students;
    }
}
