package org.itstep.game;

public class Shrubs {
    private String [] colorsShrub = {"Красный", "Зеленый", "Синий", "Фиолетовый"};
    private int xshrub;
    private int yshrub;
    private String color;

    public Shrubs(){
        this.xshrub = (int) (Math.random() * 100);
        this.yshrub = (int) (Math.random()*100);
        this.color = colorsShrub [(int) (Math.random()*colorsShrub.length)];
    }

    public int getXshrub() {
        return xshrub;
    }

    public void setXshrub(int xshrub) {
        this.xshrub = xshrub;
    }

    public int getYshrub() {
        return yshrub;
    }

    public void setYshrub(int yshrub) {
        this.yshrub = yshrub;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
