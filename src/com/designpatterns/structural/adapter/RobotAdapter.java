package com.designpatterns.structural.adapter;

public class RobotAdapter implements Attacker {

    private final RobotArm robot;

    public RobotAdapter(RobotArm robotArm) {
        robot = robotArm;
    }

    @Override
    public void fire() {
        robot.smash();
    }

    @Override
    public void move() {
        robot.walk();
    }

    @Override
    public void armor() {
        robot.health();
    }
}
