package com.company.items.weapons;

public class Ranged implements Weapon {

    private int level;
    private int attackMod;

    public Ranged() {
        level = 1;
        attackMod = (int)WeaponStats.rangedAttack;
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
        return "Ranged";
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
