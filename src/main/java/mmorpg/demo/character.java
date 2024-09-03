package mmorpg.demo;

public abstract class character {

    private String name;
    private int attack;
    private int health;

 public character ( String name, int attack, int health ) {
    this.name = name;
    this.attack = attack; 
    this.health = health;
 }

 public int getAttack() {
    return this.attack; 
 }

 public String getName() {
   return this.name;
 }
 
 public int getHealth() {
    return this.health; 
 }

 public void setHealth( int newHealth ) {
    health = newHealth;
 }
}
