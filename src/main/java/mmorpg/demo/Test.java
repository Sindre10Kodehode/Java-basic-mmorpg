package mmorpg.demo;

import jakarta.annotation.PostConstruct;
import mmorpg.demo.characters.DragonRider;
import mmorpg.demo.characters.Mage;
import mmorpg.demo.characters.Warrior;
import org.springframework.stereotype.Service;

@Service
public class Test {

    @PostConstruct
    public void uppsi(){

    Warrior shrek = new Warrior("Shrek");

    Mage sander = new Mage("Sander");

    DragonRider donkey = new DragonRider("Donkey");

    Abilities.combat(shrek, sander);

    Abilities.fly(sander);

    Abilities.fly(donkey);

    Abilities.combat(shrek, donkey);
    }
}
