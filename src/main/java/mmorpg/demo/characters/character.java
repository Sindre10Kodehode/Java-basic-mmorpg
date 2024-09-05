package mmorpg.demo.characters;

public abstract class character {

    private final String name;
    private final int attack;
    private int health;

 public character (String name, int attack, int health ) {
    this.name = name;
    this.attack = attack; 
    this.health = health;
 }

    public String getName() {
   return this.name;
 }

    public int getAttack() {
        return this.attack;
    }

    public int getHealth() {
    return this.health;
 }

    public void setHealth( int newHealth ) { health = newHealth;}

    }

