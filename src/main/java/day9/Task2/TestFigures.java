package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        /*в инструкции к заданию и в тестах цвет стоит в конце, я переделал, так как
        на поле color идёт ссылка через ключевое слово super, а в теории говорилось, что
        обязательно такое поле первым должно быть. Подскажите, я что-то не так понял?
         */
        calculateRedPerimeter(figures);
        calculateRedArea(figures);
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())) {
                sum += figures[i].perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())) {
                sum += figures[i].area();
            }
        }
        return sum;
    }
}
