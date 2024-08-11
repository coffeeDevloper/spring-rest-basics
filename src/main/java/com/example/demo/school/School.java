package com.example.demo.school;

import com.example.demo.student.Student;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {

    @Id
    @GeneratedValue
    private Integer id;
    private String school;
    @OneToMany(mappedBy = "school",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Student> student;

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public School() {
    }

    public School(String school) {
        this.id = id;
        this.school = school;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String name) {
        this.school = name;
    }
}
