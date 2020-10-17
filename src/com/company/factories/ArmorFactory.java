package com.company.factories;

import com.company.items.armor.*;

public class ArmorFactory {

    public Armor create(ArmorTypes armorType) {
        switch (armorType) {
            case CLOTH:
                return new Cloth();
            case PLATE:
                return new Plate();
            case LEATHER:
                return new Leather();
            default:
                return null;
        }
    }
}
