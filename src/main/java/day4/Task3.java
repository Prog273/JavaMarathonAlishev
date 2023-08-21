package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[12][8];
        Random rand = new Random();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = rand.nextInt(50);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        int max_sum_idx = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                sum = 0;
                sum = sum + twoDimArray[i][j];
            }
            if (sum >= max_sum) {
                max_sum = sum;
                max_sum_idx = i;
            }
        }
        System.out.println(max_sum_idx);
    }
}
