package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements IClassRoom {

    private final IStudentDAO studentDAO;
    private List<Student> students = new ArrayList<>();

    ClassRoom(IStudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void loadClassRoom() {
        students = studentDAO.getStudents();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public IClassRoom clone() {
        IClassRoom cloneClassRoom = new ClassRoom(studentDAO);
        for (Student student : students) {
            cloneClassRoom.addStudent(student);
        }
        return cloneClassRoom;
    }
}
