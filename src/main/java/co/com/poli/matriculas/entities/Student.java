package co.com.poli.matriculas.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Student {
    private Long id;
    private String name;
    private Boolean state;

    public Student() {
    }

    public Student(Long id) {
        this.id = id;
    }

    public Student(Long id, String name, Boolean state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
