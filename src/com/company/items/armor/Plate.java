package com.company.items.armor;

public class Plate implements Armor {

    private String slot;

    public Plate() {
        this.slot = "";
    }

    @Override
    public String getName() {
        return "Super Duper Plate";
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
