package com.androidjavapoint.recyclerviewexample;

public class Employee {

    private String employeeName;
    private int employeeId;

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
