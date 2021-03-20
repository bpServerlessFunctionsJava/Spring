package com.spring.bpSpring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    //Consider getting Data form Database
    public List<Employee> employees() {
        List<Employee> list = new ArrayList();

        Employee e = new Employee(1, "name", "thisis@mockmail.com", null);
        list.add(e);

        for(int i = 2; i < 100; i++){
            e = new Employee(i, "name", "thisis@mockmail.com", e);
            list.add(e);
        }

        return list;
    }
}
