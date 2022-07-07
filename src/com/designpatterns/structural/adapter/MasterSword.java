package com.designpatterns.structural.adapter;

public class MasterSword {

    public void stab() {
        System.out.println("Causes damage 5");
    }

    public void run() {
        System.out.println("Sprints 10 Steps");
    }

    public void heal() {
        System.out.println("Heals 5 faster");
    }
}
