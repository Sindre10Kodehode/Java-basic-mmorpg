package mmorpg.demo;

import jakarta.annotation.PostConstruct;

public class main {

    private Abilities abilities;
    
    @PostConstruct
    public void uppsi(){
    Warrior sindre = new Warrior("Sindre");

    Mage sander = new Mage("Sander");

    abilities.combat(sindre, sander);

    }
}
