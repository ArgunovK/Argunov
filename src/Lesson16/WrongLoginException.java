package Lesson16;

/**
 * Created by Админ on 26.09.2017.
 */
public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }

    public WrongLoginException (String masage){
        super(masage);
    }

}
