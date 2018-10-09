package org.itstep.game;

public class Mouse {
    private int xstart;
    private int ystart;
    private int x;
    private int y;
    private int wind;
    private String name;
    private boolean vectorx = true;
    private boolean vectory = true;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Mouse(String name) {
        this.x = this.xstart = (int) (Math.random() * 100);
        this.y = this.ystart = (int) (Math.random() * 100);
        this.name = name;
        this.color = "Белая";
    }

    public int getWind() {
        wind = (int) (Math.random() * 3);
        return wind;
    }

    public void runMouse() {
        if (this.vectorx) {
            x = x + 1 + getWind();
        } else x = x - 1 - getWind();
        if (this.vectory) {
            y = y + 1 + getWind();
        } else y = y - 1 - getWind();
        if (x <= 0) {
            x = 0;
            this.vectorx = true;
        } else if (x >= 99) {
            x = 99;
            this.vectorx = false;
        }
        if (y <= 0) {
            y = 0;
            this.vectory = true;
        } else if (y >= 99) {
            y = 99;
            this.vectory = false;
        }
    }

    public void mousePlace() {
        System.out.println("Точка мыши: " + x + "," + y + ", цвет: " + color + ", имя: " + name);
    }
}





