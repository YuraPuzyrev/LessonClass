package org.itstep.lessons;

public class Circle {
    //свойства
    public double rad;
    public double pi;

    //задаем радиус
    public Circle(double rad, double pi){
        this.rad = rad;
        this.pi = pi;
    }

    //узнаем радиус
    public double getRad(){
        return rad;
    }

    //узнаем площадь
    public double sCircle(double rad) {
        return pi * (rad * rad);
    }

    //длина окружности
    public double lenCircle(double rad){
        return 2*pi*rad;
    }

    //РАЗБОР В КЛАССЕ
    /*public int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public double getSquare(){
        return Math.PI*radius*radius;
    }*/
}
