package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10001);
        }
        int max_sum = Integer.MIN_VALUE;
        int max_sum_idx = 0;
        for (int i = 0; i < arr.length - 2; i++) {
           int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arr[j];
            }
            if (sum > max_sum) {
                max_sum = sum;
                max_sum_idx = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
        System.out.println();
        System.out.println(arr[max_sum_idx] + " " + max_sum_idx +
                " " + max_sum);
    }
}
