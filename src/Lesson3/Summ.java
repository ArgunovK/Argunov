package Lesson3;

import java.util.Scanner;

/**
 * Created by Админ on 10.09.2017.
 */
public class Summ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int k = 0;
        System.out.print("Введите целое число 1: ");

        i = getIntValue(sc);
        System.out.print("Введите целое число 2: ");
        k = getIntValue(sc);
        int x = i + k;
        System.out.println("Сумма чисел: " + x);
    }

    private static int getIntValue(Scanner sc) {
        int a = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
        }
        return a;
    }
}
