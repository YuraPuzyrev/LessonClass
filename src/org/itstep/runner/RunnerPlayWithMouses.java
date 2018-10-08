package org.itstep.runner;

import org.itstep.game.Mouse;
import org.itstep.game.Shrubs;

public class RunnerPlayWithMouses {
    public static void main(String[] args) {
        Shrubs shrubs = new Shrubs();
        Mouse mouseOne = new Mouse("Грызун");
        mouseOne.mousePlace();
        Mouse mouseTwo = new Mouse("Сыроед");
        mouseTwo.mousePlace();
        /*mouseOne.runMouse();
        mouseOne.mousePlace();
        mouseTwo.runMouse();
        mouseTwo.mousePlace();*/
        do{
            mouseOne.runMouse();
            mouseOne.mousePlace();
            /*mouseTwo.runMouse();*/
        } while (true);
    }
}
