package com.mananpanchal.restAPI.service;

import com.mananpanchal.restAPI.dao.StudentRequest;
import com.mananpanchal.restAPI.entity.Student;

import java.util.List;

public interface StdService {

    public List<Student> getAllStudentByCourse(String courseName);

    Student saveStdData(StudentRequest studentRequest);

    void deleteStudent(int id);

    List<Student> getAllStudent();
}
