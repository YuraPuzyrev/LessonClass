package org.itstep.konstruktor;

public class Rabbit {
    private int x1;
    private int y1;
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int afraid;

    public Rabbit(int x1, int y1){
        x = this.x1;
        y = this.y1;
    }

    public void jumpRabbit(int dx, int dy){
        this.dx = dx;
        this.dy = dy;
        this.x = x+dx;
        this.y = y+dy;
    }

    public void afraidRabbit(int afraid){
        this.x = x+afraid*dx;
        this.y = y+afraid*dy;
    }

    public void homeRabbit(){
        x = x1;
        y = y1;
    }

    public void teleportRabbit(int x, int y){
        x1 = this.x = x;
        y1 = this.y = y;
    }

    public void printRabbit(){
        System.out.println("Координаты зайца: " +x+ " , " +y);
    }
    public void printHomeRabbit(){
        System.out.println("Координаты дома зайца: " +x1+ " , " +y1);
    }

}
