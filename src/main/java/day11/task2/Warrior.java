package day11.task2;

public class Warrior extends Hero {
    public Warrior() {
        physDef = 0.8;
        magicDef = 0;
        physAttack = 30;
    }

    public String toString() {
        return "Warrior{health=" + health + "}";
    }
}
