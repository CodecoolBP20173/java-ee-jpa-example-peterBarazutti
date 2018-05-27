package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Class")
public class Klass {
    @Id
    private String name;
    @OneToMany(mappedBy = "student_class")
    private Set<Student> students = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private CCLocation location;

    public Klass(String name, CCLocation location) {
        this.name = name;
        this.location = location;
    }

    public Klass() {}

    public Klass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
