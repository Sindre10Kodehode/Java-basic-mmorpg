package mmorpg.demo;

import mmorpg.demo.characters.character;
import mmorpg.demo.characters.wingedCharacter;

public class Abilities {

    public Abilities() {}

    private static boolean trueOrFalse() {
        double random = Math.random();
        return random < 0.5;
    }

    public static <T extends character> void fly(T theCharacter) {
        if (theCharacter instanceof wingedCharacter) {
            ((wingedCharacter) theCharacter).setFlying(true);
            System.out.println(theCharacter.getName() + " is now flying.");
        } else {
            System.out.println(theCharacter.getName() + " can not fly.");
        }
    }

    public static <T extends character, U extends character> void combat(T attacker, U defender) {

        if (defender instanceof wingedCharacter && ((wingedCharacter) defender).isFlying) {
            System.out.println(attacker.getName() + " couldn't attack " + defender.getName() + " because " + defender.getName() + " is flying.");
        } else if (trueOrFalse()) {
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