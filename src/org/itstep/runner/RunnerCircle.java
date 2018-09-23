package org.itstep.runner;

import org.itstep.lessons.Circle;

public class RunnerCircle {
    public static void main(String[] args) {
        Circle circleOne = new Circle();
        //узнаем радиус
        double r = circleOne.getRad(2.0);
        System.out.println("Радиус равен = " +r);
        //узнаем площадь
        double s = circleOne.sCircle(r);
    }
}
