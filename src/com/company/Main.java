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
        Armor cloth = exampleArmorFactory.create(ArmorTypes.CLOTH);

        // setting the new character with the type, weapon and armor
        mulan.setName("Fa Mulan");
        mulan.equipWithWeapon(katana);
        mulan.equipWithArmor(cloth);

        System.out.println("------------");
        System.out.println("Your new Hero is: " + mulan.getName());
        System.out.println("Your current level is: " + mulan.getCurrentLevel());
        System.out.println("Your hero's health is " + mulan.getHeroStats().getHealth());
        System.out.println("Your hero's strength is " + mulan.getHeroStats().getStrength());
        System.out.println("Your hero's dexterity is " + mulan.getHeroStats().getDexterity());
        System.out.println("Your hero's intelligence is " + mulan.getHeroStats().getIntelligence());
        System.out.println("------------");
        System.out.println("Your weapon is katana");
        System.out.println("Your weapon type is " + mulan.getWeapon().weaponType());
        System.out.println("Weapon level is " + mulan.getWeapon().getLevel());
        System.out.println("Weapon damage is " + mulan.getWeapon().countAttackPower());
        System.out.println("------------");
        System.out.println("Your armor is " + mulan.getArmor().getName());
        System.out.println("Your final stats with the armor on are:");
        System.out.println("Your hero's health is " + (mulan.getHeroStats().getHealth() + mulan.getArmor().getHealth()));
        System.out.println("Your hero's strength is " + (mulan.getHeroStats().getStrength() + mulan.getArmor().getStrength()));
        System.out.println("Your hero's dexterity is " + (mulan.getHeroStats().getDexterity() + mulan.getArmor().getDexterity()));
        System.out.println("Your hero's intelligence is " + (mulan.getHeroStats().getIntelligence() + mulan.getArmor().getIntelligence()));

    }
}
