package com.company.heroes;

import java.util.ArrayList;

public abstract class Hero implements CharacterStatsChanger {

    // Abstract Hero class containing
    // 1. Properties

        private String name;
        private CharacterStats characterStats;
        private Armor armor;
        private Weapon weapon;

        // Level
        private int currentLevel = 1;
        private int xpToNextLevel = 100;

        // Items
        ArrayList<String> equipment = new ArrayList<>();

        // Class
        private String heroClass;

    // 2. Behaviours

        // Getting to the next level
        public void levelUp() {
            currentLevel++;
            xpToNextLevel = (int)(xpToNextLevel*1.1);
            System.out.println("Hero got one level up!");
            System.out.println("You are now level " + currentLevel);
            System.out.println("You need " + xpToNextLevel + " xp to level up");
        }

        // Getting new equipment
        public void equipItem(String item){
            equipment.add(item);
            System.out.println("You have the following equipment:");
            for (String it: equipment) {
                System.out.println(it);
            }
        }

        // Attacking
        public void attack(){
            System.out.println("You attack with all your might!");
        }

    // Constructor

    public Hero() {
    }

    public Hero(String name, int health, int strength, int dexterity, int intelligence, int currentLevel, int xpToNextLevel, ArrayList<String> equipment, String heroClass) {
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.currentLevel = currentLevel;
        this.xpToNextLevel = xpToNextLevel;
        this.equipment = equipment;
        this.heroClass = heroClass;
    }

    // Getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getXpToNextLevel() {
        return xpToNextLevel;
    }

    public void setXpToNextLevel(int xpToNextLevel) {
        this.xpToNextLevel = xpToNextLevel;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }
}
