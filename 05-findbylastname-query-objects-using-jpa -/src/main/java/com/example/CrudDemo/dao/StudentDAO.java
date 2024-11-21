package com.example.CrudDemo.dao;

import com.example.CrudDemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findStudentid(Integer id);

    List<Student> findAll();
    List<Student> findByLastName(String theLastName);

}
