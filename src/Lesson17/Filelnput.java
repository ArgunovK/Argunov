package Lesson17;

import java.io.*;

/**
 * Created by Админ on 26.09.2017.
 */
public class Filelnput {
    public static void main(String args[]) {
        try (OutputStream output = new FileOutputStream("src\\task18\\file.txt"); ) {
            char c[] = {'a', 'b', 'c'};
            for ( char x : c) {
                output.write(x);
            }

            InputStream input = new FileInputStream("src\\task18\\file.txt");
            int size = input.available();

            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
