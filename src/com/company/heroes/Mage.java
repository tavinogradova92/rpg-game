package com.company.heroes;

import com.company.items.weapons.*;

public class Mage extends Hero {

    private int level;
    private int currentXP;
    private int nextLevelXP;

    public Mage() {
        super(HeroLevelStats.mageHealth, HeroLevelStats.mageStrength, HeroLevelStats.mageDexterity, HeroLevelStats.mageIntelligence);
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

            updatesStats.setHealth(updatesStats.getHealth() + HeroLevelStats.mageHealthLevelUp);
            updatesStats.setStrength(updatesStats.getStrength() + HeroLevelStats.mageStrengthLevelUp);
            updatesStats.setDexterity(updatesStats.getDexterity() + HeroLevelStats.mageDexterityLevelUp);
            updatesStats.setIntelligence(updatesStats.getIntelligence() + HeroLevelStats.mageIntelligenceLevelUp);

            nextLevelXP = (int) (nextLevelXP * 1.1);
            currentXP = 0 + remainingXP;
        }
        return remainingXP;
    }

    @Override
    public int attack(Weapon weapon, HeroStats stats) {
        return super.attack(weapon, stats);
    }
}
