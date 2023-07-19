package com.in28minutes.learnspringboot.courses.controller;

import com.in28minutes.learnspringboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses(){

        return Arrays.asList(new Course(1,"Learn Microservices","jagannath"),
                new Course(1,"full stack with angular & react","sandeep"));
    }

    @GetMapping("/courses/1")
    public Course getOneCourse(){

        return new Course(1,"Learn Microservices 1","jagannath");
    }


}
