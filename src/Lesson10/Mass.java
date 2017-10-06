package Lesson10;

/**
 * Created by Админ on 25.09.2017.
 */
public class Mass {
    public static void main(String[] args) {
        Printable b1 = new Magazine();
        Printable[] book = new Printable[2];
        book[0] = b1;
        book[1] = new Book();
        for (Printable printable : book) {
            printable.print();
        }
        printMagazines(book);
        printBook(book);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Magazine)
                printable1.print();
        }

    }

    public static void printBook(Printable[] printable) {
        for (Printable printable2 : printable) {
            if (printable2 instanceof Book)
                printable2.print();
        }

    }
}

