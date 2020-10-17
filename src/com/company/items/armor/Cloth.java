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

    public double slotsScaler() {
        return SlotsScaler.countSlotsScaler(slot);
    }

    @Override
    public int getHealth() {
        String slot = getSlot();
        return (int)(ArmorStats.clothHealth * slotsScaler());
    }

    @Override
    public int getIntelligence() {
        String slot = getSlot();
        return (int)(ArmorStats.clothIntelligence * slotsScaler());
    }

    @Override
    public int getDexterity() {
        String slot = getSlot();
        return (int)(ArmorStats.clothDexterity * slotsScaler());
    }

    @Override
    public int getStrength() {
        return 0;
    }
}
