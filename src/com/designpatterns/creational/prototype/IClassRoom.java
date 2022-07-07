package com.designpatterns.creational.prototype;

import java.util.List;

public interface IClassRoom extends Cloneable {

    void loadClassRoom();

    void addStudent(Student student);

    List<Student> getStudents();

    IClassRoom clone();
}
