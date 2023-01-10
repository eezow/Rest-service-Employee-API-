package com.example.restservice;
  
import java.net.URI;
import org.springframework.beans
    .factory.annotation.Autowired;
import org.springframework.http
    .ResponseEntity;
import org.springframework.web.bind
    .annotation.GetMapping;
import org.springframework.web.bind
    .annotation.PostMapping;
import org.springframework.web.bind
    .annotation.RequestBody;
import org.springframework.web.bind
    .annotation.RequestMapping;
import org.springframework.web.bind
    .annotation.RestController;
import org.springframework.web.servlet
    .support.ServletUriComponentsBuilder;
 
//classes for access to the properties to be used 
import com.example.restservice.Employees;
import com.example.restservice.EmployeeManager;
import com.example.restservice.Employee;

//rest controller
@RestController
@RequestMapping(path = "/employees")

public class EmployeeController {
    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping(
        path = "/",
        produces = "application/json"
    )


    public Employees getEmployeesAll(){
        return employeeManager.getEmployees();
    }

    
}
