package org.itstep.runner;

import org.itstep.konstruktor.Rectangle;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(2,2,3,3);
        rectangleOne.rectPrint();
        Rectangle rectangleTwo = new Rectangle(2,4);
        rectangleTwo.rectPrint();
        Rectangle rectangleThree = new Rectangle();
        rectangleThree.rectPrint();

        rectangleOne.move(1,2);
        rectangleOne.rectPrint();

        rectangleTwo.move(2,2);
        rectangleTwo.rectPrint();

        rectangleThree.move(3,3);
        rectangleThree.rectPrint();
    }
}
