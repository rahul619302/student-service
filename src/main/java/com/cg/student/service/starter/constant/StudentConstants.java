package com.cg.student.service.starter.constant;

public enum StudentConstants {

    S200("Success"), S400("Excetion Occured"), S401("Invalid Student Id");;

    private String message;

    StudentConstants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
