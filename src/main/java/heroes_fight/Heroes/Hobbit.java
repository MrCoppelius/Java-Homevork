package heroes_fight.Heroes;

public class Hobbit extends  Hero {
    public Hobbit(String name) {
        this.hp = 3;
        this.power = 0;
        this.name = name;
    }

    @Override
    void kick(Hero enemy) {
        System.out.println(toCry());
    }

    @Override
    boolean isAlive() {
        return hp > 0;
    }

    String toCry() {
        return ":~(";
    }


}
