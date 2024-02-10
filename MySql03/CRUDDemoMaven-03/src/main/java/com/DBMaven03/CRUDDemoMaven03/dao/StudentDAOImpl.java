package com.DBMaven03.CRUDDemoMaven03.dao;

import com.DBMaven03.CRUDDemoMaven03.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository // HelpFul for the component scanning of DAO classes
public class StudentDAOImpl implements StudentDAO{
//    First we need to inject the entity manager
//    We will use the constructor injection
    private EntityManager entityManager; // Define the entity manager

//    @Autowired // This will inject the entity manager
//    public StudentDAOImpl(EntityManager theEntityManager) {
//        entityManager = theEntityManager;
//    } you can generate the constructor using the IDE

@Autowired // This will inject the entity manager
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional // This will handle the transaction management
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id); // This will return the student
//        (Entity Class, primary key) 
    }

    //    Now we need to implement the methods Save
    @Override
    @Transactional // This will handle the transaction management
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
