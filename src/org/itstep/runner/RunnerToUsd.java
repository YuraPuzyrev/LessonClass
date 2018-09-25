package org.itstep.runner;

import org.itstep.lessons.Tousd;

public class RunnerToUsd {
    public static void main(String[] args) {
        Tousd usd = new Tousd();
        usd.setByn(5);
        usd.setCourse(1.98);
        double a = usd.conv();
        System.out.println(a);

        usd.setByn(10);
        usd.setCourse(2.11);
        double b = usd.conv();
        System.out.println(b);
    }
}
