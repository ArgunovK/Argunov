package Lesson6;

import java.util.Random;

/**
 * Created by Админ on 14.07.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);
        double faktorial = 1;
        for (int a = 1; a <= i ; a++) {
            faktorial = faktorial * a;
        }
        System.out.println(faktorial);
    }
}
