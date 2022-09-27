package com.ahanchar.spring.rest;

import com.ahanchar.spring.rest.configuration.MyConfig;
import com.ahanchar.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//        Employee empById = communication.getEmployee(5);
//        System.out.println(empById);

//        Employee emp = new Employee("Anton", "Hanchar",
//                "HR", 1000);
//        emp.setId(9);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(8);
    }
}
