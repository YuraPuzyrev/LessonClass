package org.itstep.game;

public class Shrubs {
    private int xshrub;
    private int yshrub;
    private String color;

    public Shrubs(){
        this.xshrub = getXshrub();
        this.yshrub = getYshrub();
        this.color = getColor();
    }

    public String getColor (){
        String [] colorsShrub = {"Красный", "Зеленый", "Синий", "Фиолетовый"};
        int c = (int) (Math.random()*colorsShrub.length);
        return colorsShrub[c];
    }

    public int getXshrub(){
        return (int) (Math.random() * 100);
    }

    public int getYshrub(){
        return (int) (Math.random()*100);
    }
}
