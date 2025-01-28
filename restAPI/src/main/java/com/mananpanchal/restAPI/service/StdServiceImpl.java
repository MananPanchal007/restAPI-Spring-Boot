package com.mananpanchal.restAPI.service;

import com.mananpanchal.restAPI.dao.StudentRequest;
import com.mananpanchal.restAPI.entity.Student;
import com.mananpanchal.restAPI.repo.StudentRepo;
import com.mananpanchal.restAPI.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StdServiceImpl implements StdService{

    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> getAllStudentByCourse(String courseName) {
        return studentRepo.findByCourse(courseName);
    }

    @Override
    public Student saveStdData(StudentRequest studentRequest) {

        return studentRepo.save(Utility.Mapper(studentRequest));
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return   studentRepo.getAllStudentData();
    }
}
