package org.itstep.runner;

import org.itstep.konstruktor.Square;

public class RunnerSquare {
    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println(square.sSquare());
        square.incSquare(9);
        System.out.println(square.sSquare());

    }
}
