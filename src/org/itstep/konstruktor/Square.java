package org.itstep.konstruktor;

public class Square {
    private double l;

    public Square(double l){
        this.l = l;
    }

    public Square(){
        l = 0;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double sSquare (){
        return l*l;
    }

    public void incSquare (double n){
        this.l = l*Math.sqrt(n);
    }
}
