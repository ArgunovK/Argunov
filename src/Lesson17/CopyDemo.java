package Lesson17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Админ on 26.09.2017.
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter out1 = new BufferedWriter(new FileWriter("file1.txt"));


        String s1 = "Мне нравится Java!";
        String s2 = "I like Java!";

        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("file1.txt")))) {
            printWriter.println(s1);
            printWriter.printf(s1);
            printWriter.write(s2);
            printWriter.print("Конец");
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
