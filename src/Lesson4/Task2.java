package Lesson4;

import java.util.Scanner;

public class Task2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите первое число:");
            int a = in.nextInt();
            System.out.println("Введите второе число:");
            int b = in.nextInt();
            int c = a+b;
            System.out.println("Сумма = "+c);
        } catch (Exception e) {
            System.out.println("Неверные данные!");
        }
    }
}