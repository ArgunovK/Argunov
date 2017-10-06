package Lesson12;

/**
 * Created by Админ on 25.09.2017.
 */
public class YearDemo {
    public static void main(String[] args) {
        Season year = Season.SUMMER;
        switch (year) {
            case SUMMER: {
                System.out.println("Я люблю лето");
                break;
            }
            case AUTUMN: {
                System.out.println("Я люблю осень");
                break;
            }
            case SPRING: {
                System.out.println("Я люблю весну");
            }
            case WINTER: {
                System.out.println("Я люблю зиму");
            }
        }
        for (Season season : Season.values()){
            System.out.println(season + " " + season.getDescription());
            System.out.println(season + "" + season.getTemperature());
        }
        year = Season.valueOf("SUMMER");
        System.out.println("Моё любимое время года " + year);

    }
}
