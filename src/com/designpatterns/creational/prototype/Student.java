package com.designpatterns.creational.prototype;

public class Student {

    private final int id;
    private final String name;
    private final Gender gender;
    private final float cGPA;
    private final float attendancePercent;

    public Student(int id, String name, Gender gender, float cGPA, float attendancePercent) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.cGPA = cGPA;
        this.attendancePercent = attendancePercent;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCGPA() {
        return cGPA;
    }

    public float getAttendance() {
        return attendancePercent;
    }

    public Gender getGender() {
        return gender;
    }
}
