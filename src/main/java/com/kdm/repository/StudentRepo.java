package com.kdm.repository;

import com.kdm.domain.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Kasun Dinesh on 07-Jul-17.
 */
public interface StudentRepo {
    List<Student> getStudents();

    boolean addStudent(Student student);

    int deleteStudent(String userName);

    int updateStudent(Student student);

    Student searchStudent(String userName);
}
