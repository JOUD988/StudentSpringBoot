package com.example.thebegin.controllers;

import com.example.thebegin.student.Student;
import com.example.thebegin.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/")
public class BaseController {

    public static int SUCCESS = 200;
    public static int CREADTED = 201;


    @Autowired
    public BaseController() {

    }




}
