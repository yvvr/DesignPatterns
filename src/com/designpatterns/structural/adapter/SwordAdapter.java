package com.designpatterns.structural.adapter;

public class SwordAdapter implements Attacker {

    private final MasterSword sword;

    public SwordAdapter(MasterSword sword) {
        this.sword = sword;
    }

    @Override
    public void fire() {
        sword.stab();
    }

    @Override
    public void move() {
        sword.run();
    }

    @Override
    public void armor() {
        sword.heal();
    }
}
