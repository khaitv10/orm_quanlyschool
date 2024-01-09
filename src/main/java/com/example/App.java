package com.example;

import com.example.DAO.StudentDAO;
import com.example.entitys.Student;
import com.example.utils.HibernateUtils;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args ) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        StudentDAO stdDao = new StudentDAO();

        try {
            Student newStd = stdDao.addStudent();
            session.save(newStd);
            System.out.println("Add Success!");
        } catch (Exception e) {
            System.out.println("Add Error!");
        }


        tx.commit();
        session.close();
    }


}
