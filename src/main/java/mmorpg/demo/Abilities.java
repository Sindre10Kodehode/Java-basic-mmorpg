package mmorpg.demo;


public class Abilities {

    public Abilities() {

    }
    
    public static <T extends character, U extends character> void combat(T attacker, U defender) {
        defender.setHealth(defender.getHealth() - attacker.getAttack());
        System.out.println(defender.getName() + "took" + attacker.getAttack() + "damage." + defender.getName() + "now has" + defender.getHealth() + "left.");
    }
}
