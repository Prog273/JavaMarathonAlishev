package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10001);
            System.out.println(arr[i]);
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            if (number % 10 == 0) {
                count++;
                sum += number;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов, оканчивающихся на ноль: " + count);
        System.out.println("Сумма элементов, оканчивающихся на ноль " + sum);
    }
}
