package com.company.items.armor;

public class Leather implements Armor {

    private String slot;

    public Leather() {
        this.slot = "";
    }

    @Override
    public String getName() {
        return "Super Duper Leather";
    }

    @Override
    public void setSlot(String slot) {
        this.slot = slot;
    }

    @Override
    public String getSlot() {
        return slot;
    }

    @Override
    public int getHealth() {
        return ArmorStats.leatherHealth;
    }

    @Override
    public int getIntelligence() {
        return 0;
    }

    @Override
    public int getDexterity() {
        return ArmorStats.leatherDexterity;
    }

    @Override
    public int getStrength() {
        return ArmorStats.leatherStrength;
    }
}
