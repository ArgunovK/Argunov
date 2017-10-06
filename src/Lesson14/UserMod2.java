package Lesson14;

/**
 * Created by Админ on 25.09.2017.
 */
public class UserMod2 {
    private static String login = "Max";
    private static int password = 123456;

    static class Query{
        void printToLog(){
            System.out.println(login + password);
        }
    }
}
