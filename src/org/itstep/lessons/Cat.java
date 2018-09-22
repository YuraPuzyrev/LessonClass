package org.itstep.lessons;

public class Cat {
    String nameCat;
    int countEyes;

    char getFirstLetterName(){
        char[] letters = nameCat.toCharArray();
        return letters[0];
    }

    void printCatNameToConsole(){
        System.out.println(nameCat);
    }
}
