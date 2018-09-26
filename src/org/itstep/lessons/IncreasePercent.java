package org.itstep.lessons;

public class IncreasePercent {
    public double [] incPerc(double [] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i]+(a[i]*10/100);
        }
        return a;
    }
}
