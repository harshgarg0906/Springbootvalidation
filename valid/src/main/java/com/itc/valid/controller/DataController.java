package com.itc.valid.controller;


import com.itc.valid.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class DataController {

    @GetMapping("/user")
    public ResponseEntity<Student> getData(@RequestParam(defaultValue = " testdata") String data)
    {
        Student student =new Student("harsh","garg","harshgarg0906@gail.com","12234");
        return new ResponseEntity<Student>(student,HttpStatus.OK);
    }

    @PostMapping(value = "/user",consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Student> postData(@Valid @RequestBody Student student) {

        return new ResponseEntity<Student>(student,HttpStatus.OK);
    }

}
