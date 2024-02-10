package com.DBMaven03.CRUDDemoMaven03.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
//    define the fields
    @Id // this is the primary key
    @GeneratedValue(strategy= GenerationType.IDENTITY) // this will auto increment the id
    @Column(name="id") // this is the name of the column in the database
    private int id;
    @Column(name="first_name") // this is the name of the column in the database
    private String firstName;
    @Column(name="last_name") // this is the name of the column in the database
    private String lastName;
    @Column(name="email") // this is the name of the column in the database
    private String email;
//    At this point, we have defined the fields and the annotations to map the fields to the database table
//    Now we need to create the constructor
    public Student() { // entity class should have a no-arg constructor
    }
    public Student(String firstName, String lastName, String email) { // this is the constructor
//        no need to set the id because it will be auto generated
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
//    Now we need to generate the getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() { // this is the getter
        return firstName;
    }

    public void setFirstName(String firstName) { // this is the setter
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//    Now we need to generate the toString method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
