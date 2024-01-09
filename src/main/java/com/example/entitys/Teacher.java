package com.example.entitys;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Phone")
    private long phone;

    @Column(name = "Address")
    private String address;

    @OneToMany(mappedBy = "teacher")
    private List<RegisterCourse> registerCourseList;

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<RegisterCourse> getRegisterCourseList() {
        return registerCourseList;
    }

    public void setRegisterCourseList(List<RegisterCourse> registerCourseList) {
        this.registerCourseList = registerCourseList;
    }
}
