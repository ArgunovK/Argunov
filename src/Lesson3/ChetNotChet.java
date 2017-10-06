package Lesson3;

import java.util.Scanner;

/**
 * Created by Админ on 10.09.2017.
 */
public class ChetNotChet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            int x = i % 2;
            if (x == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
