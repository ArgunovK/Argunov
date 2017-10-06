package lesson9;

/**
 * Created by Админ on 01.08.2017.
 */
public class Rectangle extends Shape {
    int x = 30;
    int y = 40;

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (x != rectangle.x) return false;
        return y == rectangle.y;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    public String draw() {
        return "Рисую квадрат";

    }
}