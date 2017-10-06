package Lesson6;

import java.util.Arrays;

/**
 * Created by Админ on 22.09.2017.
 */
public class SelChange {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[][] data = {
                {},
                {5},
                {4, -3, 3, 5},
                {54, 234, 5, 5, 356},
                {6, 8, 3, 123, 4, 3, 5, 0, 3, -24, 7, 54, 423, 45245, 404, 4699, 97, 56, 21, 568, 63, 21, 5, 5},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
            long finish = System.nanoTime();
            long time = finish - start;
            System.out.println(time);

        }
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            int x = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < x) {
                    k = j;
                    if (array[i] != array[j]) {
                        x = array[j];
                        array[k] = array[i];
                        array[i] = x;
                    }
                }
            }
        }
    }
}
