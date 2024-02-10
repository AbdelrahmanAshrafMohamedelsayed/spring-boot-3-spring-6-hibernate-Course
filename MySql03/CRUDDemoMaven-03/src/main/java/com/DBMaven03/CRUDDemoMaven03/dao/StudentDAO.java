package com.DBMaven03.CRUDDemoMaven03.dao;

import com.DBMaven03.CRUDDemoMaven03.entity.Student;

public interface StudentDAO {
//    implement the methods
//    public List<Student> findAll();
    Student findById(Integer id); // why Integer? because it can be null ???

     void save(Student theStudent); // this will save the student
//    public void deleteById(int theId);
}
