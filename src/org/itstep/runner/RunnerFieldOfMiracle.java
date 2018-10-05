package org.itstep.runner;

import org.itstep.konstruktor.FieldOfMiracles;

public class RunnerFieldOfMiracle {
    public static void main(String[] args) {
        FieldOfMiracles fieldOfMiracles = new FieldOfMiracles(5,10,15,20,25,30,35,40,45,50);
        fieldOfMiracles.printField();
        fieldOfMiracles.randomField();
        fieldOfMiracles.randomField();
        fieldOfMiracles.randomField();
    }
}
