package Lesson5;

/**
 * Created by Админ on 13.07.2017.
 */
public class Task4 {
    public static void main(String args[]) {
        int days = 4;
        String day;
        switch (days) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Выходной";
                break;
            case 7:
                day = "Выходной";
                break;
            default:
                day = "Нет такого дня";
        }
        System.out.println("Сегодня " + day + ".");
    }
}
