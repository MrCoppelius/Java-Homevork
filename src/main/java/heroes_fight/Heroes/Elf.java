package heroes_fight.Heroes;

public class Elf extends Hero{
    public Elf(String name) {
        this.hp = 10;
        this.power = 12;
        this.name = name;
    }

    @Override
    void kick(Hero enemy) {
        if (power > enemy.power) {
            enemy.hp = 0;
        }
        else {
            enemy.power--;
        }
    }

    @Override
    boolean isAlive() {
        return this.hp > 0;
    }
}
