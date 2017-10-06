package lesson9;

/**
 * Created by Админ on 01.08.2017.
 */
public class Class1 {
    public static void main(String[] args) {
        Shape[] figures = new Shape[2];
        figures[0] = new Circle();
        figures[1] = new Rectangle();
        for (Shape figures1: figures) {
            System.out.println(figures1.draw());
        }

    }
}
