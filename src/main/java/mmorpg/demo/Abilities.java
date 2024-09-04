package mmorpg.demo;


import mmorpg.demo.characters.character;

public class Abilities {

    public Abilities() {

    }

    private static boolean trueOrFalse() {
        double random = Math.random();
        return random < 0.5;
    }
    
    public static <T extends character, U extends character> void combat(T attacker, U defender) {

        if (trueOrFalse()) {
            int attack = attacker.getAttack();
            attack = attack / 2;
            attacking(attack, attacker.getName(), defender);
        } else {
            int attack = attacker.getAttack();
            attacking(attack, attacker.getName(), defender);
        }
    }
    private static <U extends character> void attacking(int attack, String attackerName, U defender) {
        defender.setHealth(defender.getHealth() - attack);
        System.out.println(attackerName + " attacked " + defender.getName() + " for " +
                attack + " damage. " + defender.getName() + " now has " + defender.getHealth() + " health left!");
    }

}
