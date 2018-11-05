package com.cg.student.service.starter.controller;

import com.cg.student.service.starter.payload.Request;
import com.cg.student.service.starter.payload.Response;
import com.cg.student.service.starter.service.IStudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;
    Logger logger= LogManager.getLogger(StudentController.class);

    @PostMapping("/save")
    public Response saveEmployee(@RequestBody Request request) throws Exception {
        Response response=studentService.saveStudent(request);
        logger.info(response);
        return response;
    }

    @GetMapping({"/get", "/get/{id}"})
    public Response getEmployee(@PathVariable Optional<Integer> id) throws Exception {
        Response response=null;
        if (id.isPresent())
            response=studentService.getStudent(id.get());
        logger.info(response);
        return response;
    }
}
