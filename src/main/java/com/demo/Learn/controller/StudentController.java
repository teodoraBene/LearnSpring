package com.demo.Learn.controller;

import com.demo.Learn.service.DbInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private DbInitializer dbInitializer;

    @GetMapping("/dbInit")
    public String init() {
        dbInitializer.dbInit();
        return "3 students have registered";

    }


}
