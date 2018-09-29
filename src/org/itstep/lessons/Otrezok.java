package org.itstep.lessons;

import java.util.Random;

public class Otrezok {
    public int getNumberFromInterval(int a, int b){
        int result;
        Random random = new Random();
            result = random.nextInt(b-a)+a;
        return result;
    }
}
