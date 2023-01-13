package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;


@ExtendWith(MockitoExtension.class)

class EmployeeTest {
    @Mock
    private EmployeeManager employeeManager;

    @InjectMocks
    private Employee employee;
    private Employees employees;

    @BeforeEach
    public void setup(){

        employee =  new Employee("7","caleb", "mathebula","caleblindani@gmail.com",
                "amazon@aws");
    }

    @DisplayName("JUNIT test for adding an edmployee")

    @Test
    public void givenEmployeeObject(){
        //i tried writing this unit tests but i currently could not figure them out
    }





}
