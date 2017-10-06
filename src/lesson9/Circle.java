package lesson9;

/**
 * Created by Админ on 01.08.2017.
 */
    public class Circle extends Shape {
        int x = 10;
        int y = 20;

        public String draw() {
            return "Рисую круг";
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            Circle circle = (Circle) o;

            if (x != circle.x) return false;
            return y == circle.y;
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + x;
            result = 31 * result + y;
            return result;
        }

    }


