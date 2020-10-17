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

    public double slotsScaler() {
        return SlotsScaler.countSlotsScaler(slot);
    }

    @Override
    public int getHealth() {
        String slot = getSlot();
        return (int)(ArmorStats.leatherHealth * slotsScaler());
    }

    @Override
    public int getIntelligence() {
        return 0;
    }

    @Override
    public int getDexterity() {
        String slot = getSlot();
        return (int)(ArmorStats.leatherDexterity * slotsScaler());
    }

    @Override
    public int getStrength() {
        String slot = getSlot();
        return (int)(ArmorStats.leatherStrength * slotsScaler());
    }
}
