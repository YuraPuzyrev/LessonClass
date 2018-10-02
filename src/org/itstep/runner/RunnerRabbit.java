package org.itstep.runner;

import org.itstep.konstruktor.Rabbit;

public class RunnerRabbit {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(0,0);
        rabbit.jumpRabbit(1,1);
        rabbit.printRabbit();
        rabbit.afraidRabbit(3);
        rabbit.printRabbit();
        rabbit.homeRabbit();
        rabbit.printRabbit();
        rabbit.printHomeRabbit();
        rabbit.teleportRabbit(5,5);
        rabbit.printHomeRabbit();
    }
}
