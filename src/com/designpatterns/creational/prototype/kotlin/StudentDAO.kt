package com.designpatterns.creational.prototype.kotlin

import java.util.ArrayList

class StudentDAO : IStudentDAO {

    private val students: MutableList<Student> = ArrayList()

    init {
        students.add(Student(1, "Jon Snow", Gender.BOY, 9.2f, 82.0f))
        students.add(Student(2, "Daenerys", Gender.GIRL, 9.0f, 72.0f))
        students.add(Student(3, "Arya Stark", Gender.GIRL, 9.8f, 40.0f))
        students.add(Student(4, "Grey Worm", Gender.BOY, 8.5f, 50.0f))
        students.add(Student(5, "Sansa Stark", Gender.GIRL, 7.5f, 62.0f))
        students.add(Student(6, "Tyrion Lannister", Gender.BOY, 8.5f, 58.0f))
    }

    override fun getStudentsList(): List<Student> {
        // Very expensive operation.
        return students
    }
}