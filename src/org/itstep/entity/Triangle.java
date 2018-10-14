package org.itstep.entity;

import org.itstep.exceptions.TriangleLessThanZeroException;
import org.itstep.exceptions.TriangleSideException;



public class Triangle {
    private double a; //первая сторона
    private double b; //вторая сторона
    private double c; //третья сторона
    private double p; //полупериметр
    private double s; //площадь

    public Triangle(){
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double getHalfperimeter(){ //вычисление полупериметра
        this.p = (a+b+c)/2;
        return p;
    }

    public void sTriangle(){ //вычисление площади
        this.s = (Math.sqrt(p*(p - a)*(p - b)*(p - c)));
    }

    public void printSides(){
        System.out.println("Стороны треугольника:" +a+ ", " +b+ ", " +c);
    }

    public void printHalfperimeter(){
        System.out.println("Полупериметр равен =" +p);
    }

    public void printSTriangle(){
        System.out.println("Площадь треугольника равна =" +s);
    }

    public void excTriangle() throws TriangleLessThanZeroException, TriangleSideException {
        if (a<=0 || b<=0 || c<=0 ){
            throw new TriangleLessThanZeroException();
        }
        if ((a+b)<=c || (b+c)<=a || (a+c)<=b){
            throw new TriangleSideException();
        }
    }
}
