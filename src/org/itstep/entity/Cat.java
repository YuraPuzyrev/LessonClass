package org.itstep.entity;

import org.itstep.exceptions.ColourEyesException;
import org.itstep.exceptions.CountEyesException;

public class Cat {
    private int countEyes;
    private String colourEyes;

    public Cat (int countEyes, String colourEyes){
        this.countEyes = countEyes;
        this.colourEyes = colourEyes;
    }

    public void printCountEyes(){
        if (countEyes!=2){
            throw new IndexOutOfBoundsException();
        }
        System.out.println("Количество глаз кота:" + countEyes);
    }

    public void printColourEyes() throws ColourEyesException, CountEyesException{
        if (!colourEyes.equalsIgnoreCase("Зеленые")){
            throw new ColourEyesException();
        }
        if (countEyes!=2){
            throw new CountEyesException();
        }
        System.out.println("Цвет глаз кота:" + colourEyes);
    }
}
