package com.company.items.armor;

public class Cloth implements Armor {
    private String slot;

    public Cloth() {
        this.slot = "";
    }

    @Override
    public String getName() {
        return "Super Duper Cloth";
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
        String slot = getSlot();
        return (int)(ArmorStats.clothHealth * SlotsScaler.countSlotsScaler(slot));
    }

    @Override
    public int getIntelligence() {
        String slot = getSlot();
        return (int)(ArmorStats.clothIntelligence * SlotsScaler.countSlotsScaler(slot));
    }

    @Override
    public int getDexterity() {
        String slot = getSlot();
        return (int)(ArmorStats.clothDexterity * SlotsScaler.countSlotsScaler(slot));
    }

    @Override
    public int getStrength() {
        return 0;
    }
}
