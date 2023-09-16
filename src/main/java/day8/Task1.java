package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "0";
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            string = string + " " + i;
        }
        System.out.println(string);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
        System.out.println();
        System.out.println();
        System.out.println();

        StringBuilder sb = new StringBuilder(string);
        long startTime2 = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            sb.append(" " + i);
        }
        System.out.println(sb.toString());
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));

    }
}
