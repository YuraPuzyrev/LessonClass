package org.itstep.runner;

import org.itstep.lessons.Cat;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Random random = new Random();
        Cat catOne = new Cat();
        catOne.countEyes = random.nextInt(20);
        catOne.nameCat = "Пушок";

        char firstLetter = catOne.getFirstLetterName();
        System.out.println("Первая бука имени: " + firstLetter);

        catOne.printCatNameToConsole();

        int a = catOne.getMultEyes(random.nextInt(10));

        Cat catTwo = new Cat();
        catTwo.nameCat = "Кефир";
        catTwo.countEyes = random.nextInt(20);

        if(catOne.countEyes>=catTwo.countEyes){
            System.out.println(catOne.nameCat + " котистее");
        }else {
            System.out.println(catOne.nameCat + " не вау");
        }
    }
}
