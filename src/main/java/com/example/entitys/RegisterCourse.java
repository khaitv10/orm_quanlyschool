package com.example.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "RegisterCourse")
public class RegisterCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "StudentID", referencedColumnName = "ID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "TeacherID", referencedColumnName = "ID")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "CourseID", referencedColumnName = "ID")
    private Course course;

    public RegisterCourse() {
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
