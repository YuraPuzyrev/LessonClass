package org.itstep.runner;

import org.itstep.konstruktor.Home;

public class RunnerHome {
    public static void main(String[] args) {
        Home home = new Home(2,3, "Чистилище");
        home.homePrint();
        home.move(5,8);
        home.homePrint();

        Home homeTwo = new Home(1,9, "Университет");
        homeTwo.homePrint();
        home.move(7,8);
        homeTwo.homePrint();

        Home homeThree = new Home(7,3, "Белый дом");
        homeThree.homePrint();
        home.move(2,1);
        homeThree.homePrint();

        Home homeFour = new Home(4,5, "Морг");
        homeFour.homePrint();
        home.move(9,9);
        homeFour.homePrint();

        Home homeFive = new Home(3,6, "Академия Шаг");
        homeFive.homePrint();
        home.move(4,8);
        homeFive.homePrint();
    }
}
