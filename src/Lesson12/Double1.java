package Lesson12;

/**
 * Created by Админ on 25.09.2017.
 */
public class Double1 {
    public static void main(String[] args){
        Double d1 = 3.14;
        Double d2 = 3.14;
        Double d3 = 3.14;

        Double d4 = Double.valueOf(d1);
        Double d5 = Double.valueOf("3.14");
        Double d6 = Double.valueOf((double) 3.14);

        double dd= Double.parseDouble("3.14");

        byte b1 = d6.byteValue();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(dd);
    }
}
