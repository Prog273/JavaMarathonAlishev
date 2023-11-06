package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;
    int health;
    int physAttack;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAttack * (1 - hero.physDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }
}
