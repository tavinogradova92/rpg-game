package com.company.items.armor;

public class Cloth implements Armor {
    @Override
    public String getName() {
        return "Super Duper Cloth";
    }

    @Override
    public int getHealth() {
        return ArmorStats.clothHealth;
    }

    @Override
    public int getIntelligence() {
        return ArmorStats.clothIntelligence;
    }

    @Override
    public int getDexterity() {
        return ArmorStats.clothDexterity;
    }

    @Override
    public int getStrength() {
        return 0;
    }
}
