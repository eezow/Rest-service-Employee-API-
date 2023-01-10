
package com.example.restservice;

import org.springframework.stereotype.Repository;

import com.example.restservice.Employees;

@Repository
public class EmployeeManager {

    private static  Employees list
    = new Employees();



    static
    {

        // Creating a few employees
        // and adding them to the list
        list.getEmployeeList().add(
            new Employee(
                1,
                "amo",
                "muhle",
                "ora@muhle.com",
                "Manager"));

        list.getEmployeeList().add(
            new Employee(
                2, "oratile",
                "natash",
                "amo@natash.com",
                "developer"));

        list.getEmployeeList().add(
            new Employee(
                3, "esihle",
                "farmer",
                "esihle@farm.co.za",
                "designer"));

        
    }

    public Employees getEmployees() {

        return list;
    }
}
