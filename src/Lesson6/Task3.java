package Lesson6;

/**
 * Created by Админ on 14.07.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        String twoD[][] = new String[3][6];
        int a, b, c = 0;
        char ch = 'a';
        for (a = 0 ; a < 3; a++) {
            for (b = 0; b < 6; b++) {
                twoD[a][b] = ch + "" + (b + 1) + " " ;
            }
            ch++;
        }
        for (a = 0; a < 3; a++) {
            for (b = 0; b < 6; b++) {
                System.out.print(twoD[a][b]);
            }
            System.out.println();
        }
    }
}
