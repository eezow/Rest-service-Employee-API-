package com.example.restservice;


//creating a Resource employee class
public class Employee extends Employees {
    public Employee(){}
        //parametised constructure

        public Employee(
            Integer id, String firstName, 
            String lastName,String email , String title
        ){


            super();
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.title = title;
        }

        private Integer id;
        private String firstName;
        private String lastName;
        private String email;
        private String title;


        //getters
        public Integer getId(){
            return id;
        }

        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public String getEmail(){
            return email;
        }

        public String getTitle(){
            return title;
        }



   


    
}
