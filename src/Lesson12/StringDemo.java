package Lesson12;

/**
 * Created by Админ on 25.09.2017.
 */
public class StringDemo {
    public static void main(String args[]){
        String s = "I like Java!!!";

        char ch = "I like Java!!!".charAt(14);
        System.out.println(ch);
        System.out.println("I like Java!!!".endsWith("!!!"));
        System.out.println("I like Java!!!".startsWith("I like"));
        System.out.println("lastIndexOf(Java) = "+s.lastIndexOf("Java"));

    }
}
