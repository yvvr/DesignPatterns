package com.designpatterns.creational.prototype.kotlin

import com.designpatterns.creational.prototype.IClassRoom

interface IClassRoom : Cloneable {

    fun loadClassRoom()

    fun addStudent(student: Student)

    val students: List<Student>

    public override fun clone(): Any
}