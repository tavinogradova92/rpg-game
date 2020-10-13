package com.company;

import com.company.heroes.Hero;

public class Main {

    public static void main(String[] args) {

        // write your code here

        // 1. Create a hero
        // 2. Level up - stats increase.
        // 3. Create some items
        // 4. Assign those items to a hero
        // 5. Attack

        Hero myHero = new Hero();
        myHero.equipItem("Axe");
        myHero.levelUp();
        myHero.attack();
    }

    public static void prompt() {
        // Optional when you're done
        /*
        Steps:
        -----
        1. Provide user with a option to create a character
            - Create a warrior, mage, ranger.
            - validate input, switch(input): case "warrior": create a new warrior
        2.  Equip some items
            - Equipping a magic, melee, ranged weapon
            - Equipping helmet
            - Equipping body armor
            - Equipping legs
            2.1 Depending on selection (switch), create item & make the hero equip it.
        3. Level up
            - Type in the amount of experience the hero gains.
        4. Change equipment
        */

    }
}
