package org.itstep.lessons;

public class Circle {
    //свойства
    public double rad;
    public double pi = 3.14;

    //задаем радиус
    public void setRad(double i){
        rad = i;
    }

    //узнаем радиус
    public double getRad(double rad){
        return rad;
    }

    //узнаем площадь
    public double sCircle(double rad){
        System.out.println("Площадь круга равна = " +pi*(rad*rad));
        return pi*(rad*rad);
    }
}
