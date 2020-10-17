package com.company.factories;

import com.company.items.weapons.*;

public class WeaponsFactory {

    public Weapon create(WeaponTypes weaponType) {
        switch(weaponType) {
            case MELEE:
                return new Melee();
            case RANGED:
                return new Ranged();
            case MAGIC:
                return new Magic();
            default:
                return null;
        }
    }
}
