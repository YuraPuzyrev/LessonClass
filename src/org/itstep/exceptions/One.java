package org.itstep.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int result = 0;
        try {
            result = scanner.nextInt();
            System.out.println("Код который идёт после ввода:");
            int[] array = new int[3];
            array[3] = result;
        } catch (InputMismatchException exc) {
            System.out.println("Сработала секция catch");
            exc.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Сработала секция catch для массива");
            exc.printStackTrace();
        } catch (Exception exc){
            System.out.println("Сработала другая ошибка");
        } finally {
            System.out.println("Сработала секция finally");
        }
        System.out.println("Вы ввели: " + result);
    }
}
