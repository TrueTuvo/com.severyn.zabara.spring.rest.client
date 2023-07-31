package com.severyn.zabara.spring.client;

import com.severyn.zabara.spring.client.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.severyn.zabara.spring.client.entity.Employee;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1900);
//        employee.setId(10);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(10);
    }
}
