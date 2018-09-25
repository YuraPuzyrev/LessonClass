package org.itstep.runner;

import org.itstep.lessons.Triangle;

public class RunnerTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.getMultiple(1,2,3);
        triangle.getMultiple(1,2.2,3.3);
        triangle.getMultiple(4.5,5.8);
        //чтобы узнать какой метод - зажать ctrl
    }
}
