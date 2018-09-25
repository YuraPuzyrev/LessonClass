package org.itstep.lessons;

public class Tousd {
    private int byn;
    private double course;

    public int getByn() {
        return byn;
    }

    public void setByn(int byn) {
        this.byn = byn;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double conv(){
        return byn*course;
    }
}
