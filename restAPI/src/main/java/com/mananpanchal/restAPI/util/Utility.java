package com.mananpanchal.restAPI.util;

import com.mananpanchal.restAPI.dao.StudentRequest;
import com.mananpanchal.restAPI.entity.Student;

public class Utility {

    public static Student Mapper(StudentRequest studentRequest)
    {
        Student student=new Student();
        student.setName(studentRequest.getName());
        student.setAddress(studentRequest.getAddress());
        student.setCourse(studentRequest.getCourse());
        return student;
    }
}