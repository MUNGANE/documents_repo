package com.example.EmployeeService.response;

public class AddressResponse {


    private int Id;


    private String Lane1;


    private String Lane2;


    private String City;


    private long PinCode;


    private int EmpId;

    public int getId() {
        return Id;
    }

    public String getLane1() {
        return Lane1;
    }

    public String getLane2() {
        return Lane2;
    }

    public String getCity() {
        return City;
    }

    public long getPinCode() {
        return PinCode;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setLane1(String lane1) {
        Lane1 = lane1;
    }

    public void setLane2(String lane2) {
        Lane2 = lane2;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setPinCode(long pinCode) {
        PinCode = pinCode;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }
}
