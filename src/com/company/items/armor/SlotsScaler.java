package com.company.items.armor;

public class SlotsScaler {

    public static double countSlotsScaler(String slot) {
        switch (slot) {
            case "Body":
                return 1;
            case "Head":
                return 0.8;
            case "Legs":
                return 0.6;
            default:
                return 0;
        }
    }
}
