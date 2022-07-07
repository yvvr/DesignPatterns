package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class StudentDAO implements IStudentDAO {
    private final List<Student> students = new ArrayList<>();

    public StudentDAO() {
        students.add(new Student(1, "Jon Snow", Gender.BOY, 9.2f, 82.0f));
        students.add(new Student(2, "Daenerys", Gender.GIRL, 9.0f, 72.0f));
        students.add(new Student(3, "Arya Stark", Gender.GIRL, 9.8f, 40.0f));
        students.add(new Student(4, "Grey Worm", Gender.BOY, 8.5f, 50.0f));
        students.add(new Student(5, "Sansa Stark", Gender.GIRL, 7.5f, 62.0f));
        students.add(new Student(6, "Tyrion Lannister", Gender.BOY, 8.5f, 58.0f));
    }

    @Override
    public List<Student> getStudents() {
        // Very expensive operation.
        return students;
    }
}
