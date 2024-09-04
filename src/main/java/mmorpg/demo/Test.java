package mmorpg.demo;

import jakarta.annotation.PostConstruct;
import mmorpg.demo.characters.Mage;
import mmorpg.demo.characters.Warrior;
import org.springframework.stereotype.Service;

@Service
public class Test {

    private Abilities abilities;
    
    @PostConstruct
    public void uppsi(){

    Warrior shrek = new Warrior("Shrek");

    Mage sander = new Mage("Sander");

    abilities.combat(shrek, sander);

    }
}
