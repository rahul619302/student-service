package com.cg.student.service.starter.payload;

import com.cg.student.service.starter.constant.StudentConstants;

import java.util.Map;

public class Response {
    
    private StudentConstants status;
    private String statusDiscription;
    private Map<String, Object> map;

    public Response() {
    }

    public Response(StudentConstants status, String statusDiscription, Map<String, Object> map) {
        this.status = status;
        this.statusDiscription = statusDiscription;
        this.map = map;
    }

    public StudentConstants getStatus() {
        return status;
    }

    public void setStatus(StudentConstants status) {
        this.status = status;
    }

    public String getStatusDiscription() {
        return statusDiscription;
    }

    public void setStatusDiscription(String statusDiscription) {
        this.statusDiscription = statusDiscription;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Response(StudentConstants status, String statusDiscription) {
        this.status = status;
        this.statusDiscription = statusDiscription;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", statusDiscription='" + statusDiscription + '\'' +
                ", map=" + map +
                '}';
    }
}
