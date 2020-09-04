package heroes_fight.Heroes;

import java.util.Random;

public class Human extends Hero {
    Random rn =  new Random();
    public Human(int hpMin, int hpMax, int powerMin, int powerMax) {
        this.hp = hpMin + rn.nextInt(hpMax - hpMin);
        this.power = powerMin + rn.nextInt(powerMax - powerMin);
    }

    @Override
    void kick(Hero enemy) {
        enemy.hp -= rn.nextInt(power);
    }

    @Override
    boolean isAlive() {
        return this.hp > 0;
    }
}
