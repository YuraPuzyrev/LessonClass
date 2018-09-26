package org.itstep.runner;

import org.itstep.lessons.Mass;

import java.util.Arrays;
import java.util.Random;

public class RunnerMass {
    public static void main(String[] args) {
        Random random = new Random();
        Mass mass = new Mass();
        int [] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(10);
        }
        mass.a(b);
        System.out.println(Arrays.toString(b));
    }
}
