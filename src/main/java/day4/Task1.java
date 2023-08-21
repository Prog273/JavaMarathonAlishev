package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (rand.nextInt(11));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Длина массива: " + arr.length + "\n");

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int sum = 0;
        for (int d : arr) {
            if (d > 8) {
                count1++;
            }
            if (d == 1) {
                count2++;
            }
            if (d % 2 == 0) {
                count3++;
            } else {
                count4++;
            }
            sum += d;
        }
        System.out.println("Количество чисел больше 8: " + count1);
        System.out.println("Количество чисел, равных 1: " + count2);
        System.out.println("Количество чётных чисел: " + count3);
        System.out.println("Количество нечётных чисел: " + count4);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
