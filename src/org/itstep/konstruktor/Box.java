package org.itstep.konstruktor;

public class Box {
    private int width; //ширина коробки
    private int height; //высота коробки
    private int depth; //глубина коробки

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(int i){
        this(i, i, i);
    }

    public Box(){
    }

    //вычисляем объем коробки
    public int getVolume(){
        return width * height* depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
