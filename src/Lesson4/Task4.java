package Lesson4;

/**
 * Created by Админ on 12.07.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        int count = 0;
        for (String str : args) {
            System.out.println(count++ + " аргумент = " + str);
        }
    }
}

