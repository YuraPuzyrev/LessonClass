package org.itstep.konstruktor;

import java.util.Arrays;

public class FieldOfMiracles {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int [] arr;

    public FieldOfMiracles (int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        int [] arr = {a, b, c, d, e, f, g, h, i, j};
        this.arr = arr;
    }

    public void printField (){
        System.out.println(Arrays.toString(arr));
    }

    public void randomField (){
        int x = (int) (Math.random()*arr.length);
        System.out.println("Цифра " +arr[x]+ " на барабане");
    }
}
