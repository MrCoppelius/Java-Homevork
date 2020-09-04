package heroes_fight.Heroes;

public abstract class Hero {
    protected int hp;
    protected int power;
    protected String name;
    abstract void kick(Hero enemy);
    abstract boolean isAlive();
}
