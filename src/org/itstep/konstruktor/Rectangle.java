package org.itstep.konstruktor;

public class Rectangle {
    //Task 1
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(int width, int height){
        x2 = width;
        y2 = height;
        x1 = 0;
        y1 = 0;
    }

    public Rectangle(){
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }

    //Task 2
    public void rectPrint(){
        System.out.println("x1= " +x1+ " y1= " +y1+ " x2= " +x2+ " y2= " +y2);
    }

    public void move(int dx, int dy){
        x1 = x1+dx;
        y1 = y1+dx;
        x2 = x2+dy;
        y2 = y2+dy;
    }

}
