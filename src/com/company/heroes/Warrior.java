package com.company.heroes;

import com.company.items.weapons.Weapon;

public class Warrior extends Hero {

    private int level;
    private int currentXP;
    private int nextLevelXP;

    public Warrior() {
        super(HeroLevelStats.warriorHealth, HeroLevelStats.warriorStrength, HeroLevelStats.warriorDexterity, HeroLevelStats.warriorIntelligence);
        level = 1;
        currentXP = 0;
        nextLevelXP = 100;
    }

    @Override
    public int getCurrentLevel() {
        return level;
    }

    // Calculate if a Warrior can go one level up or not
    @Override
    public int calculateXpToNextLevel(int xpToNextLevel) {
        currentXP += xpToNextLevel;
        int remainingXP = 0;

        if(currentXP >= nextLevelXP) {
            level++;
            remainingXP = currentXP - nextLevelXP;

            HeroStats updatesStats = super.getHeroStats();

            updatesStats.setHealth(updatesStats.getHealth() + HeroLevelStats.warriorHealthLevelUp);
            updatesStats.setStrength(updatesStats.getStrength() + HeroLevelStats.warriorStrengthLevelUp);
            updatesStats.setDexterity(updatesStats.getDexterity() + HeroLevelStats.warriorDexterityLevelUp);
            updatesStats.setIntelligence(updatesStats.getIntelligence() + HeroLevelStats.warriorIntelligenceLevelUp);

            nextLevelXP = (int) (nextLevelXP * 1.1);
            currentXP = 0 + remainingXP;
        }
        return nextLevelXP;
    }

    @Override
    public int attack(Weapon weapon, HeroStats stats) {
        return super.attack(weapon, stats);
    }


}
