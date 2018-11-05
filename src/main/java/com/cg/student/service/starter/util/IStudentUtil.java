package com.cg.student.service.starter.util;

import com.cg.student.service.starter.payload.Request;
import com.cg.student.service.starter.payload.Response;
import com.cg.student.service.starter.pojo.Address;
import com.cg.student.service.starter.pojo.Student;

import java.util.List;
import java.util.Map;

public interface IStudentUtil {

    List<Address> getAddress(Student student, String addressType, List<Map<String, String>> addressList) throws Exception;

    Student getStudent(Request request, Map<String, Object> map) throws Exception;

    Response getSuccessResponse(List<Student> students, Student Student, String name) throws Exception;

    Response invalidStudentIdResponse() throws Exception;
}
