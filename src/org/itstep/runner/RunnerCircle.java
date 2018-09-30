package org.itstep.runner;

import org.itstep.lessons.Circle;

public class RunnerCircle {
    public static void main(String[] args) {
        Circle circleOne = new Circle(3,3.14);
        //узнаем радиус
        double r = circleOne.getRad();
        System.out.println("Радиус равен = " +r);
        //узнаем площадь
        double s = circleOne.sCircle(r);
        System.out.println("Площадь круга равна = " +s);
        //узнаем длину
        double l = circleOne.lenCircle(r);
        System.out.println("Длина окружности равна = " +l);
    }
}
