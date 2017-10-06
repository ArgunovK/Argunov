package Lesson14;

/**
 * Created by Админ on 25.09.2017.
 */
public class UserMod {
    private String login = "Max";
    private int password = 123456;


    public void createQuery(){
        class Query{
            void printToLog(){
                System.out.println( login + password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }
    public static void main(){

    }
}
