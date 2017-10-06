package Lesson14;

/**
 * Created by Админ on 25.09.2017.
 */
public class User {
    private String login = "Max";
    private int password = 123456;

    public class Query{
        void printToLog(){
            System.out.println( login + password);
        }
    }

    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }
    public static void main(){
        User us = new User();
    }
}
