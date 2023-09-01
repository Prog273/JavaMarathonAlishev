package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random rand = new Random();
        int mark = rand.nextInt(4) + 2;
        String mark1 = "";
        switch (mark) {
            case 2:
                mark1 = "неудовлетворительно";
                break;
            case 3:
                mark1 = "удовлетворительно";
                break;
            case 4:
                mark1 = "хорошо";
                break;
            case 5:
                mark1 = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем "
                + student.getName() + " по предмету " + this.subject + " на оценку " + mark1);
    }
}
