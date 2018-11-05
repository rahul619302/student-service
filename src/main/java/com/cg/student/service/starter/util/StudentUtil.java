package com.cg.student.service.starter.util;

import com.cg.student.service.starter.constant.StudentConstants;
import com.cg.student.service.starter.payload.Request;
import com.cg.student.service.starter.payload.Response;
import com.cg.student.service.starter.pojo.Address;
import com.cg.student.service.starter.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class StudentUtil implements IStudentUtil {

    @Override
    public List<Address> getAddress(Student student, String addressType, List<Map<String, String>> addressList) throws Exception {
        List<Address> addresses = new ArrayList<>();
        for (Map<String, String> addressMap : addressList) {
            Address address = new Address();
            address.setFlatNo(addressMap.get("flatNo") != null ? addressMap.get("flatNo") : " ");
            address.setArea(addressMap.get("area") != null ? addressMap.get("area") : " ");
            address.setCity(addressMap.get("city") != null ? addressMap.get("city") : " ");
            address.setState(addressMap.get("state") != null ? addressMap.get("state") : " ");
            address.setCountry(addressMap.get("country") != null ? addressMap.get("country") : " ");
            address.setAddressType(addressType);
            address.setStudent(student);
            addresses.add(address);
        }
        return addresses;
    }

    @Override
    public Student getStudent(Request request, Map<String, Object> map) throws Exception {
        Student Student = new Student();
        Student.setId(Integer.valueOf(request.getParam3()));
        Student.setName(request.getParam1());
        return Student;
    }

    @Override
    public Response getSuccessResponse(List<Student> students, Student student, String name) throws Exception {
        Response response = new Response(StudentConstants.S200, StudentConstants.S200.getMessage());
        if (student != null || students != null) {
            Map<String, Object> map = new LinkedHashMap<>(2);
            if (student != null)
                map.put(name, student);
            else
                map.put(name, students);
            response.setMap(map);
        }
        return response;
    }

    @Override
    public Response invalidStudentIdResponse() throws Exception {
        return new Response(StudentConstants.S401, StudentConstants.S401.getMessage());
    }
}
