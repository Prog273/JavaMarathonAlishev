package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        addNumbers(numbers);
        System.out.println(numbers);
    }
/* изначально следующий метод прописал без static, выдало ошибку, IDEA подсказала сделать static, заработало.
Дело в том, что применяю этот метод внутри static метода main? Поэтому следующий метод надо сделать static?
 */
    public static void addNumbers(ArrayList list) {
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        for (int i = 300; i < 351; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
    }
}
