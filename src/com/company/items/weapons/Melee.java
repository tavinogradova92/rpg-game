package com.company.items.weapons;

public class Melee implements Weapon {

    private int level;
    private int attackMod;

    public Melee() {
        level = 1;
        attackMod = (int)WeaponStats.meleeAttack;
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
        return "Melee";
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
