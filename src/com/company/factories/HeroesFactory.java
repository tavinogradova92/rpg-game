package com.company.factories;

import com.company.heroes.*;
import com.company.heroes.Hero;

public class HeroesFactory {

    public Hero create(HeroTypes heroType) {
        switch(heroType) {
            case WARRIOR:
                return new Warrior();
            case RANGER:
                return new Ranger();
            case MAGE:
                return new Mage();
            default:
                return null;
        }
    }
}
