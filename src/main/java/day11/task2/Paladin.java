package day11.task2;

public class Paladin extends Hero implements Healer {
    static final int HEAL_AMOUNT = 25;
    static final int HEAL_TEAMMATE_AMOUNT = 20;


    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAttack = 15;

    }

    @Override
    public void healHimself() {
        if (health + HEAL_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_AMOUNT;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE_AMOUNT; }
    }

    public String toString() {
        return "Paladin{health=" + health + "}";
    }
}
