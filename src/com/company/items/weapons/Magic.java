package com.company.items.weapons;

public class Magic implements Weapon {
    private int level;
    private int attackMod;

    public Magic() {
        level = 1;
        attackMod = (int)WeaponStats.magicAttack;
    }

    @Override
    public int countAttackPower() {
        return attackMod;
    }

    @Override
    public void setAttackDamage(int modify) {
        attackMod = modify;
    }

    @Override
    public String weaponType() {
        return "Magic";
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return level;
    }
}
