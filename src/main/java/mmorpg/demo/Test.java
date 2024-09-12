package mmorpg.demo;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import mmorpg.demo.characters.DragonRider;
import mmorpg.demo.characters.Mage;
import mmorpg.demo.characters.Warrior;
import mmorpg.demo.characters.character;
import org.springframework.stereotype.Service;

import java.util.*;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.toList;

@Slf4j
@Service
public class Test {

    @PostConstruct
    public void uppsi(){

    Warrior shrek = new Warrior("Shrek");

    Mage sander = new Mage("Sander");
    Mage henrik = new Mage("Henrik");

    DragonRider donkey = new DragonRider("Donkey");

    Abilities.combat(shrek, sander);
    Abilities.fly(sander);
    Abilities.combat(shrek, donkey);
    Abilities.combat(shrek, donkey);
    Abilities.fly(donkey);
    Abilities.combat(shrek, donkey);

        System.out.println(" ");

    List<character> characterList = new ArrayList<>();
        characterList.add(shrek);
        characterList.add(sander);
        characterList.add(henrik);
        characterList.add(donkey);

            log.info("List = " + characterList);

        Set<character> characterSet = new HashSet<>(characterList);

            System.out.println("Set = " + characterSet);

    Map<String, character> characterMap = new HashMap<>();
        characterMap.put("1", shrek);
        characterMap.put("2", sander);
        characterMap.put("3", henrik);
        characterMap.put("4", donkey);

            System.out.println("Map = " + characterMap);

    List<character> listOfMages = characterList.stream()
            .filter(character -> character instanceof Mage).toList();
        System.out.println("List of Mages = " + listOfMages);
    }
}
