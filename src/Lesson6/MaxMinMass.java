package Lesson6;

import java.util.Arrays;

/**
 * Created by Админ on 22.09.2017.
 */
public class MaxMinMass {
    public static final int ROW_COUNT = 5;
    public static final int COLUMN_COUNT = 8;

    public static void main(String[] args) {
        int start[][] = {
                {25345, -234, 343, 1345, 64, -523, 5, 235},
                {4, 4, 12, -4, 235, -11, 523, 645},
                {24, 124, 456, 4153, 134, 152, 4, 53456},
                {-134, 134, 7567, 346, -656, 436, 65, 346},
                {-345, 345, 345, -23, 546, 765, 2, 456}
        };
        System.out.println(Arrays.deepToString(start));
        minMax(start);
    }

    public static void minMax(int[][] start) {
        int finish[][] = new int[ROW_COUNT][2];
        for (int i = 0; i < ROW_COUNT; i++) {
            int min = start[i][0];
            int max = start[i][0];
            for (int j = 0; j < COLUMN_COUNT; j++) {
                if (start[i][j] < min) {
                    min = start[i][j];
                }
                if (start[i][j] > max) {
                    max = start[i][j];
                }
            }
            finish[i][0] = min;
            finish[i][1] = max;
        }
        System.out.println(Arrays.deepToString(finish));
    }
}
