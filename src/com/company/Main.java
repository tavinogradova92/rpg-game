package com.company;

import com.company.factories.*;
import com.company.heroes.*;
import com.company.items.armor.*;
import com.company.items.weapons.*;

public class Main {

    public static void main(String[] args) {

        HeroesFactory exampleHeroFactory = new HeroesFactory();
        WeaponsFactory exampleWeaponFactory = new WeaponsFactory();
        ArmorFactory exampleArmorFactory = new ArmorFactory();

        // defining stats
        Hero mulan = exampleHeroFactory.create(HeroTypes.WARRIOR);
        Weapon katana = exampleWeaponFactory.create(WeaponTypes.MELEE);
        Weapon crossbow = exampleWeaponFactory.create(WeaponTypes.RANGED);
        Weapon wand = exampleWeaponFactory.create(WeaponTypes.MAGIC);
        Armor cloth = exampleArmorFactory.create(ArmorTypes.CLOTH);

        // Showing the main hero info
        mulan.setName("Fa Mulan");
        System.out.println("------------");
        System.out.println("Your new Hero is: " + mulan.getName());
        System.out.println("Your current level is: " + mulan.getCurrentLevel());
        System.out.println("Your hero's health is " + mulan.getHeroStats().getHealth());
        System.out.println("Your hero's strength is " + mulan.getHeroStats().getStrength());
        System.out.println("Your hero's dexterity is " + mulan.getHeroStats().getDexterity());
        System.out.println("Your hero's intelligence is " + mulan.getHeroStats().getIntelligence());

        // Showing melee weapon data
        mulan.equipWithWeapon(katana);
        System.out.println("------------");
        System.out.println("Your weapon is katana");
        System.out.println("Your weapon type is " + mulan.getWeapon().weaponType());
        System.out.println("Weapon level is " + mulan.getWeapon().getLevel());
        System.out.println("Weapon damage is " + mulan.getWeapon().countAttackPower());

        // Showing ranged weapon data
        mulan.equipWithWeapon(crossbow);
        System.out.println("------------");
        System.out.println("You've changed your weapon. Now your weapon is crossbow");
        System.out.println("Your weapon type is " + mulan.getWeapon().weaponType());
        System.out.println("Weapon level is " + mulan.getWeapon().getLevel());
        System.out.println("Weapon damage is " + mulan.getWeapon().countAttackPower());

        // Showing magic weapon data
        mulan.equipWithWeapon(wand);
        System.out.println("------------");
        System.out.println("You've changed your weapon. Now your weapon is wand");
        System.out.println("Your weapon type is " + mulan.getWeapon().weaponType());
        System.out.println("Weapon level is " + mulan.getWeapon().getLevel());
        System.out.println("Weapon damage is " + mulan.getWeapon().countAttackPower());

        // Showing the body cloth armor and adding its stats to hero stats
        mulan.equipWithArmor(cloth);
        cloth.setSlot("Body");
        System.out.println("------------");
        System.out.println("Your armor is " + mulan.getArmor().getName());
        System.out.println("Slot: " + cloth.getSlot());
        System.out.println("Your final stats with the armor on your " + cloth.getSlot() + " are:");
        System.out.println("Your hero's health is " + (mulan.getHeroStats().getHealth() + mulan.getArmor().getHealth()));
        System.out.println("Your hero's strength is " + (mulan.getHeroStats().getStrength() + mulan.getArmor().getStrength()));
        System.out.println("Your hero's dexterity is " + (mulan.getHeroStats().getDexterity() + mulan.getArmor().getDexterity()));
        System.out.println("Your hero's intelligence is " + (mulan.getHeroStats().getIntelligence() + mulan.getArmor().getIntelligence()));

        // Showing the head cloth armor and adding its stats to hero stats
        mulan.equipWithArmor(cloth);
        cloth.setSlot("Head");
        System.out.println("------------");
        System.out.println("Your armor is " + mulan.getArmor().getName());
        System.out.println("Slot: " + cloth.getSlot());
        System.out.println("Your final stats with the armor on your " + cloth.getSlot() + " are:");
        System.out.println("Your hero's health is " + (mulan.getHeroStats().getHealth() + mulan.getArmor().getHealth()));
        System.out.println("Your hero's strength is " + (mulan.getHeroStats().getStrength() + mulan.getArmor().getStrength()));
        System.out.println("Your hero's dexterity is " + (mulan.getHeroStats().getDexterity() + mulan.getArmor().getDexterity()));
        System.out.println("Your hero's intelligence is " + (mulan.getHeroStats().getIntelligence() + mulan.getArmor().getIntelligence()));

        // Showing the legs cloth armor and adding its stats to hero stats
        mulan.equipWithArmor(cloth);
        cloth.setSlot("Legs");
        System.out.println("------------");
        System.out.println("Your armor is " + mulan.getArmor().getName());
        System.out.println("Slot: " + cloth.getSlot());
        System.out.println("Your final stats with the armor on your " + cloth.getSlot() + " are:");
        System.out.println("Your hero's health is " + (mulan.getHeroStats().getHealth() + mulan.getArmor().getHealth()));
        System.out.println("Your hero's strength is " + (mulan.getHeroStats().getStrength() + mulan.getArmor().getStrength()));
        System.out.println("Your hero's dexterity is " + (mulan.getHeroStats().getDexterity() + mulan.getArmor().getDexterity()));
        System.out.println("Your hero's intelligence is " + (mulan.getHeroStats().getIntelligence() + mulan.getArmor().getIntelligence()));

        // Showing the current level and how many XPs the hero needs to get to the next level
        System.out.println("------------");
        int currentLevelXP = 20;
        System.out.println("Your current XP level is " + currentLevelXP + " You need to reach " + mulan.calculateXpToNextLevel(currentLevelXP) + " XP to get to the next level.");

        // Showing the next level and how many XPs the hero needs to get to the next level raised by 10%
        System.out.println("------------");
        int nextLevelXP = 100;
        System.out.println("You are at level 2 now. You need to reach " + mulan.calculateXpToNextLevel(nextLevelXP) + " XP to get to the next level.");

        // Attacking, counting the total damage power
        mulan.equipWithWeapon(wand);
        cloth.setSlot("Body");
        System.out.println("------------");
        System.out.println("Your Hero has the following attack power now:");
        System.out.println("Your weapon is a wand. The type is " + mulan.getWeapon().weaponType());
        System.out.println("Weapon damage is " + mulan.getWeapon().countAttackPower());
        System.out.println("Your armor is " + mulan.getArmor().getName());
        System.out.println("Slot: " + cloth.getSlot());
        System.out.println("Your final damage with the weapon and armor on are " + mulan.attack(wand, mulan.getHeroStats()));
    }
}
