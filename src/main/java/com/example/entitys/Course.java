package com.example.entitys;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NameCourse")
    private String nameCourse;

    @Column(name = "Description")
    private String decs;

    @OneToMany(mappedBy = "course")
    private List<RegisterCourse> registerCourseList;

    @OneToMany(mappedBy = "course")
    private List<Transcript> transcripts;

    public Course() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public List<RegisterCourse> getRegisterCourseList() {
        return registerCourseList;
    }

    public void setRegisterCourseList(List<RegisterCourse> registerCourseList) {
        this.registerCourseList = registerCourseList;
    }
}
