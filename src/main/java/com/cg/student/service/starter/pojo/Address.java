package com.cg.student.service.starter.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "Address_Tbl")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Address_Id")
    private int id;
    @Column(name = "Flat_No")
    private String flatNo;
    @Column(name = "Area")
    private String area;
    @Column(name = "City")
    private String city;
    @Column(name = "State")
    private String state;
    @Column(name = "Country")
    private String country;
    @Column(name = "Address_Type")
    private String addressType;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="emp_student_fk")
    @JsonBackReference
    private Student student;

    public Address() {
    }

    public Address(int id, String flatNo, String area, String city, String state, String country, String addressType, Student student) {
        this.id = id;
        this.flatNo = flatNo;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
        this.addressType = addressType;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", flatNo='" + flatNo + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", addressType='" + addressType + '\'' +
                ", student=" + student +
                '}';
    }
}
