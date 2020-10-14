package com.company.items.armor;

public class Plate implements Armor {
    @Override
    public String getName() {
        return "Super Duper Plate";
    }

    @Override
    public int getHealth() {
        return ArmorStats.plateHealth;
    }

    @Override
    public int getIntelligence() {
        return 0;
    }

    @Override
    public int getDexterity() {
        return ArmorStats.plateDexterity;
    }

    @Override
    public int getStrength() {
        return ArmorStats.plateStrength;
    }
}
