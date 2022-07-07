package com.designpatterns.creational.prototype.kotlin

import java.util.ArrayList

class ClassRoom internal constructor(private val studentDAO: IStudentDAO) : IClassRoom {

    override var students: MutableList<Student> = ArrayList()

    override fun loadClassRoom() {
        students = studentDAO.getStudentsList() as MutableList<Student>
    }

    override fun addStudent(student: Student) {
        students.add(student)
    }

    override fun clone(): IClassRoom {
        val cloneClassRoom: IClassRoom = ClassRoom(studentDAO)
        for (student in students) {
            cloneClassRoom.addStudent(student)
        }
        return cloneClassRoom
    }
}