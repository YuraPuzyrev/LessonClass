package org.itstep.runner;

import org.itstep.lessons.Dog;

import java.util.Random;

public class RunnerDog {
    public static void main(String[] args) {
        Random random = new Random();
        Dog dogOne = new Dog();
        dogOne.colorEyes = "Карий";
        dogOne.countLegs = random.nextInt(5);
        dogOne.colorEyesToConsole();
        dogOne.korenFromLegs();

        Dog dogTwo = new Dog();
        dogTwo.colorEyes = "Синий";
        dogTwo.countLegs = random.nextInt(5);
        dogTwo.colorEyesToConsole();
        dogTwo.korenFromLegs();

        if(dogOne.colorEyes==dogTwo.colorEyes){
            System.out.println("Они родственники");
        }else {
            System.out.println("Ваще ни разу не родственники");
        }
    }
}
