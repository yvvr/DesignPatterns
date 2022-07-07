package com.designpatterns.creational.prototype.kotlin

class Teacher(studentDAO: IStudentDAO) {

    private val classRoom: IClassRoom

    init {
        classRoom = ClassRoom(studentDAO)

        // Perform database load operation.
        classRoom.loadClassRoom()
    }

    fun doObservations() {
        val newClassRoom = classRoom.clone() as IClassRoom

        // New students joined class.
        newClassRoom.addStudent(Student(7, "Davos Seaworth", Gender.BOY, 0.0f, 0.0f))
        newClassRoom.addStudent(Student(8, "Margaery Tyrell", Gender.GIRL, 0.2f, 0.0f))
        newClassRoom.addStudent(Student(9, "Jaime Lannister", Gender.BOY, 0.0f, 0.0f))
        printInfoOfStudents(newClassRoom.students)

        // Get attendance status
        val lowerAttendanceStudents = getListOfLowerAttendanceStudents((classRoom.clone() as IClassRoom).students as MutableList<Student>)
        for (student in lowerAttendanceStudents) System.out.printf(
                "Student: %s, Attendance: %f", student.name, student.attendance)
    }

    private fun printInfoOfStudents(students: List<Student?>) {
        var boysCount = 0
        var girlsCount = 0
        for (student in students) {
            if (student!!.gender === Gender.BOY) boysCount++ else girlsCount++
        }
        System.out.printf(
                "ClassRoom totalCount:%d, boys:%d, girls:%d%n",
                boysCount + girlsCount, boysCount, girlsCount)
    }

    private fun getListOfLowerAttendanceStudents(students: MutableList<Student>): List<Student> {
        students.removeIf { student -> student.attendance > 60.0f }
        return students
    }
}