package org.itstep.runner;

import org.itstep.game.Mouse;
import org.itstep.game.Shrubs;

public class RunnerPlayWithMouses {
    public static void main(String[] args) {
        Shrubs[] shrubs = new Shrubs[18];
        Mouse mouseOne = new Mouse("Грызун");
        mouseOne.mousePlace();
        Mouse mouseTwo = new Mouse("Сыроед");
        mouseTwo.mousePlace();
        for (int i = 0; i < shrubs.length; i++) {
            shrubs[i] = new Shrubs();
        }

        go: do {
            for (int i = 0; i < shrubs.length; i++) {
                if (mouseOne.getX() == shrubs[i].getXshrub() && mouseOne.getY() == shrubs[i].getYshrub()) {
                    mouseOne.setColor(shrubs[i].getColor());
                    System.out.println("Победил мышонок " + mouseOne.getName() + ", он первый нашел куст в координатах: " + shrubs[i].getXshrub() + ":"
                            + shrubs[i].getYshrub() + " и перекрасился в цвет " + mouseOne.getColor());
                    break go;
                }
                if (mouseTwo.getX() == shrubs[i].getXshrub() && mouseTwo.getY() == shrubs[i].getYshrub()) {
                    mouseTwo.setColor(shrubs[i].getColor());
                    System.out.println("Победил мышонок " + mouseTwo.getName() + ", он первый нашел куст в координатах: " + shrubs[i].getXshrub() + ":"
                            + shrubs[i].getYshrub() + " и перекрасился в цвет " + mouseTwo.getColor());
                    break go;
                }
            }
            mouseOne.runMouse();
            mouseTwo.runMouse();
        } while (true);
    }
}
