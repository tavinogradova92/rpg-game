package com.company.heroes;
import com.company.items.armor.Armor;
import com.company.items.weapons.Weapon;


public abstract class Hero implements HeroStatsChanger {

    // Abstract Hero class containing properties

        private String name;
        private HeroStats heroStats;
        private Armor armor;
        private Weapon weapon;
        private int level;
        private int xpToNextLevel;


    // Constructor

    public Hero() {
    }

    public Hero(int health, int strength, int dexterity, int intelligence) {
        this.name = "";
        heroStats = new HeroStats(health, strength, dexterity, intelligence);
    }

    // Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentLevel() {
        return level;
    }

    public int calculateXpToNextLevel(int xpToNextLevel) {
        return xpToNextLevel;
    }

    @Override
    public HeroStats getHeroStats() {
        return heroStats;
    }

    @Override
    public void setHeroStats(HeroStats heroStats) {
        this.heroStats = heroStats;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Actions

    public void equipWithArmor(Armor armor) {
        this.armor = armor;
    }

    public void equipWithWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public abstract int attack();


}
