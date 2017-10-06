package Lesson5;

/**
 * Created by Админ on 13.07.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        int days = 8;
        String day;
        if (days == 1) {
            day = "Понедельник";
        } else if (days == 2) {
            day = "Вторник";
        } else if (days == 3) {
            day = "Среда";
        } else if (days == 4) {
            day = "Четверг";
        } else if (days == 5) {
            day = "Пятница";
        } else if (days == 6 || days == 7) {
            day = "Выходные";
        } else {
            day = "Нет такого дня";
        }
        System.out.println("Сегодня" + " " + day + ".");
    }
}