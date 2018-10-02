package org.itstep.konstruktor;

public class Home {
    private int x;
    private int y;
    private String name;

    public Home(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void homePrint(){
        System.out.println("Название дома: " +name+ " Широта: " +x+ " Долгота:" +y);
    }
}

