/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muk.dao;

import com.muk.entity.Student;
import java.util.List;

public interface StudentDao {

    public List<Student> getAllStudents();

    public Student getStudent(int id);

    public boolean isStudentValid(String Name);

    public Student getStudentName(String Name);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);

    public void addStudent(Student student);

}
