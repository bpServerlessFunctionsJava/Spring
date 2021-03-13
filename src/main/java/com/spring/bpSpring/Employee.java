package com.spring.bpSpring;

import java.util.List;

public class Employee {
    private int empId;
    private String empname;
    private String email;
    private List<String> list;
    private Employee supervisor;

    public Employee() {
    }

    public Employee(int empId, String empname, String email, Employee supervisor, List<String> list) {
        this.empId = empId;
        this.empname = empname;
        this.email = email;
        this.supervisor = supervisor;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empname='" + empname + '\'' +
                ", email='" + email + '\'' +
                ", list='" + list + '\'' +
                ", supervisor='" + supervisor + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }
}