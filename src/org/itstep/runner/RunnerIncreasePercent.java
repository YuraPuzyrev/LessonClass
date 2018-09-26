package org.itstep.runner;

import org.itstep.lessons.IncreasePercent;

import java.util.Arrays;
import java.util.Random;

public class RunnerIncreasePercent {
    public static void main(String[] args) {
        Random random = new Random();
        IncreasePercent inPer = new IncreasePercent();
        double [] a = new double [5];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println("Старый массив: " + Arrays.toString(a));
        inPer.incPerc(a);
        System.out.println("Новый массив: " +Arrays.toString(a));
    }
}
