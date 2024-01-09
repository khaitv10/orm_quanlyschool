package com.example.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "Transcript")
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "StudentID", referencedColumnName = "ID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "CourseID", referencedColumnName = "ID")
    private Course course;

    @Column(name = "Mark")
    private float mark;

    public Transcript() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
