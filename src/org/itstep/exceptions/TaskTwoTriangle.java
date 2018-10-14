package org.itstep.exceptions;

import org.itstep.entity.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskTwoTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            try {
                Triangle triangle = new Triangle();
                System.out.println("Введите положительные числа для сторон треугольника:");
                triangle.setA(scanner.nextDouble());
                triangle.setB(scanner.nextDouble());
                triangle.setC(scanner.nextDouble());
                triangle.excTriangle();
                triangle.printSides();
                triangle.getHalfperimeter();
                triangle.printHalfperimeter();
                triangle.sTriangle();
                triangle.printSTriangle();
                x = false;
            } catch (InputMismatchException exc) {
                System.out.println("Вы ввели буквы, введите числа!");
                scanner.nextLine();
            } catch (TriangleLessThanZeroException exc){
                System.out.println("Введите положительные числа!");
                scanner.nextLine();
            } catch (TriangleSideException exc){
                System.out.println("Сумма двух сторон должна быть больше третьей!");
                scanner.nextLine();
            } finally {
                System.out.println("finally!");
            }
            }
        }
    }
