package org.itstep.exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа");
        int[] array = new int[4];
        for (int i = 0; i <array.length ; i++) {
        try{
            array[i] = scanner.nextInt();
        }catch (InputMismatchException exc) {
           scanner.nextLine();
        }
        }System.out.println(Arrays.toString(array));
    }
}
