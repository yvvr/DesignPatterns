package com.designpatterns.creational.prototype;

import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("ALL")
public class Teacher {

    private final IClassRoom classRoom;

    public Teacher(IStudentDAO studentDAO) {
        classRoom = new ClassRoom(studentDAO);
        // Perform database load operation.
        classRoom.loadClassRoom();
    }

    public void doObservations() {

        IClassRoom newClassRoom = classRoom.clone();

        // New students joined class.
        newClassRoom.addStudent(new Student(7, "Davos Seaworth", Gender.BOY, 0.0f, 0.0f));
        newClassRoom.addStudent(new Student(8, "Margaery Tyrell", Gender.GIRL, 0.2f, 0.0f));
        newClassRoom.addStudent(new Student(9, "Jaime Lannister", Gender.BOY, 0.0f, 0.0f));

        printInfoOfStudents(newClassRoom.getStudents());

        List<Student> lowerAttendanceStudents = getListOfLowerAttendanceStudents(classRoom.clone().getStudents());
        for (Student student : lowerAttendanceStudents)
            System.out.printf(
                    "Student: %s, Attendance: %f", student.getName(), student.getAttendance());
    }

    private void printInfoOfStudents(@NotNull List<Student> students) {
        int boysCount = 0;
        int girlsCount = 0;

        for (Student student : students) {
            if (student.getGender() == Gender.BOY) boysCount++;
            else girlsCount++;
        }

        System.out.printf(
                "ClassRoom totalCount:%d, boys:%d, girls:%d%n",
                (boysCount + girlsCount), boysCount, girlsCount);
    }

    private @NotNull List<Student> getListOfLowerAttendanceStudents(
            @NotNull List<Student> students) {
        students.removeIf(student -> (student.getAttendance() > 60.0f));
        return students;
    }
}
