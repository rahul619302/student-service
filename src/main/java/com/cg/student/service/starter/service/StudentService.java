package com.cg.student.service.starter.service;

import com.cg.student.service.starter.dao.IStudentDao;
import com.cg.student.service.starter.payload.Request;
import com.cg.student.service.starter.payload.Response;
import com.cg.student.service.starter.pojo.Address;
import com.cg.student.service.starter.pojo.Student;
import com.cg.student.service.starter.util.IStudentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class StudentService implements IStudentService {

    @Autowired
    private IStudentUtil studentUtil;
    @Autowired
    private IStudentDao studentDao;
    
    @Override
    @Transactional(readOnly = false)
    public Response saveStudent(Request request) throws Exception {
        Map<String, Object> map = request.getMap();
        Student student = studentUtil.getStudent(request, map);
        String addressType = request.getParam2();
        List<Map<String, String>> addressList = (List<Map<String, String>>) map.get("address_list");
        List<Address> addresses = null;
        if (addressList != null) {
            addresses = studentUtil.getAddress(student, addressType, addressList);
            student.setAddresses(addresses);
        }
        student = studentDao.save(student);
        Response response = studentUtil.getSuccessResponse(null,student, "student");
        return response;
    }

    @Override
    public Response getStudent(Integer id) throws Exception {
        Response response = null;
        if (id == null) {
            List<Student> students = studentDao.findAll();
            response = studentUtil.getSuccessResponse(students, null, "students");
        } else {
            Optional<Student> studentOptional = studentDao.findById(id);
            if (!studentOptional.isPresent())
                return studentUtil.invalidStudentIdResponse();
            Student student = studentOptional.get();
            response = studentUtil.getSuccessResponse(null, student, "student");
        }
        return response;
    }
}
