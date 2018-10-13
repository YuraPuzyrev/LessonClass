package org.itstep.exceptions;

import org.itstep.entity.Cat;

public class Two {
    public static void main(String[] args) {
        Cat catOne = new Cat(2,"Зеленые");
        catOne.printCountEyes();
        Cat catTwo = new Cat(2,"Голубые");
        catTwo.printCountEyes();

        //для самопальных исключений:
        try{
            Cat catThree = new Cat(4,"Зеленые");
            catThree.printColourEyes();
        } catch (CountEyesException exc){
            exc.printStackTrace();
        } catch (ColourEyesException exc){
            exc.printStackTrace();
        }
    }
}
