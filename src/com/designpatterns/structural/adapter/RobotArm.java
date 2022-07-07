package com.designpatterns.structural.adapter;

public class RobotArm {

    public void smash() {
        System.out.println("Causes damage 10");
    }

    public void walk() {
        System.out.println("Moves forward 5 Steps");
    }

    public void health() {
        System.out.println("Heals 10 faster");
    }
}
