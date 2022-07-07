package com.designpatterns.structural.adapter;

public class Tanker implements Attacker {

    @Override
    public void fire() {
        System.out.println("Causes damage 15");
    }

    @Override
    public void move() {
        System.out.println("Moves 10 steps");
    }

    @Override
    public void armor() {
        System.out.println("Heals 20 faster");
    }
}
