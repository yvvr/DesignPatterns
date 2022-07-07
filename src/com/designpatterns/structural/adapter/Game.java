package com.designpatterns.structural.adapter;

import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {

        ArrayList<Attacker> attackerArrayLIst = new ArrayList<>();

        attackerArrayLIst.add(new Tanker());
        attackerArrayLIst.add(new RobotAdapter(new RobotArm()));
        attackerArrayLIst.add(new SwordAdapter(new MasterSword()));

        for (Attacker attacker : attackerArrayLIst) {
            attacker.fire();
            attacker.move();
            attacker.armor();
        }
    }
}
