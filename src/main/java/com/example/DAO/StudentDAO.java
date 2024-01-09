package com.example.DAO;

import com.example.entitys.Student;

import java.util.Scanner;

public class StudentDAO {

    private final Scanner sc = new Scanner(System.in);

//    private final SessionFactory sessionFactory;
//
//    public StudentDAO(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    public void addStudent(Student student) {
//        try (Session session = sessionFactory.openSession()) {
//            Transaction transaction = session.beginTransaction();
//            session.save(student);
//            transaction.commit();
//            System.out.println("Thêm sinh viên thành công!");
//        } catch (Exception e) {
//            System.out.println("Lỗi: " + e.getMessage());
//        }
//    }

    public Student addStudent() {
        String name, address;
        long phone;

        System.out.print("name: ");
        name = sc.nextLine();
        System.out.print("phone: ");
        phone = sc.nextLong();
        System.out.print("address: ");
        address = sc.nextLine();

        Student std = new Student();
        std.setName(name);
        std.setPhone(phone);
        std.setAddress(address);

        return std;
    }

}
