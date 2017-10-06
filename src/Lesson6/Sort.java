package Lesson6;

import java.util.Arrays;

/**
 * Created by Админ on 22.09.2017.
 */
public class Sort {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 2, 4, 12},
                {4, 2, 1, 3, 4},
                {5, 0, 2, 345, 5, 3, 2, 4, 5, 8, 1},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void sort(int[] array) {
        boolean change;
        for (int i = 0; i < array.length; i++) {
            change = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    change = true;
                }
            }
            if (!change) {
                return;
            }
        }
    }
}
