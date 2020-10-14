package com.company.items.weapons;

public interface Weapon {
    public int countAttackPower();
    public void setAttackDamage(int modify);
    public String weaponType();
    public void setLevel(int Level);
    public int getLevel();
}
