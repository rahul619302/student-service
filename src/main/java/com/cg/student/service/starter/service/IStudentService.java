package com.cg.student.service.starter.service;

import com.cg.student.service.starter.payload.Request;
import com.cg.student.service.starter.payload.Response;

public interface IStudentService {
    Response saveStudent(Request request) throws Exception;

    Response getStudent(Integer id) throws Exception;
}
