package com.demo.Learn;

import com.demo.Learn.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication {

    public static void main(String[] args) {
//


        SpringApplication.run(LearnApplication.class, args);
//        SessionFactory factory = new Configuration().
//                configure().addAnnotatedClass(Student.class).buildSessionFactory();
//        Session session = factory.getCurrentSession();

//        try {
//            Student student = new Student("paul", "john", "bla@haha.com");
//            session.beginTransaction();
//            session.save(student);
//            session.getTransaction();
//
//        } finally {
//            {
//                factory.close();
//            }
//        }
    }

}
