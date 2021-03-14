package com.spring.bpSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GetEmployees {//implements Supplier<EmployeeData> {

   /* @Override
    public EmployeeData get() {
        EmployeeData employeeData
                = new EmployeeData();
        employeeData.setEmployees(this.employees());

        return employeeData;
    }*/

    //Consider getting Data form Database
    public List<Employee> employees() {
        List<Employee> list = new ArrayList();

        List<String> items = new ArrayList() {{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
            add("f");
            add("g");
            add("h");
        }};

        Employee e = new Employee(1, "name", "thisis@mockmail.com", null,items);
        list.add(e);

        for(int i = 2; i < 100; i++){
            e = new Employee(i, "name", "thisis@mockmail.com", e, items);
            list.add(e);
        }

        return list;
    }
}
