package mmorpg.demo.characters;

public abstract class wingedCharacter extends character {

         public boolean isFlying;

    public wingedCharacter(String name, int attack, int health) {
        super ( name, attack, health );
        this.isFlying = false;
    }

    public void setFlying(boolean flying) {
        this.isFlying = flying;
    }

    public boolean isFlying() {
        return this.isFlying;
    }
}
