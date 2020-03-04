package com.demo.Learn.service;

import com.demo.Learn.model.Student;
import com.demo.Learn.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbInitializer {
    @Autowired
    private StudentRepo studentRepo;

    public void dbInit() {
        Student student1 = Student.newStudent()
                .firstName("Ray")
                .lastName("Toro")
                .email("jetStar@haha.com").build();

        Student student2 = Student.newStudent()
                .firstName("Gerard")
                .lastName("Way")
                .email("partyPoison@haha.com").build();
        Student student3 = Student.newStudent()
                .firstName("Frank")
                .lastName("Iero")
                .email("funGhoul@haha.com").build();

        studentRepo.save(student1);
        studentRepo.save(student2);
        studentRepo.save(student3);
    }
}
