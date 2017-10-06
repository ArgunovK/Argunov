package Lesson14;

/**
 * Created by Админ on 25.09.2017.
 */
public class Food {
    public void prepare(Coocable c) {c.cook();}
    public static void main(String args[]){
        Food F = new Food();
        F.prepare(new Coocable() {
            @Override
            public void cook() {
                System.out.println("Готовлю");
            }
        });
    }
}
