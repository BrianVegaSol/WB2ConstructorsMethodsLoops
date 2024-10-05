package com.pluarlsight;

public class RollTheDice {
    static int i = 0;
    public static void main(String[] args) {
        int roll1;
        int roll2;
        int result;
        int count2Rolls = 0;
        int count4Rolls = 0;
        int count6Rolls = 0;

        Dice dice = new Dice();

        for (i = 1; i < 21; i++) {
            roll1 = Dice.roll();
            roll2 = Dice.roll();
            result = roll1 + roll2;
            System.out.println("Round " + i + ": " + Dice.roll());
            //System.out.println("--------------------------");
            if (roll1 == 2 || roll2 == 2) {
                count2Rolls++;
            }
            if (Dice.roll() == 4) {
                count4Rolls ++;
            }
            if (Dice.roll() == 6) {
                count6Rolls++;
            }
        }
        //Tallys
        System.out.println("--------------------------");
        System.out.println("#2 Rolled: " + count2Rolls + " times");
        System.out.println("#4 Rolled: " + count4Rolls + " times");
        System.out.println("#6 Rolled: " + count6Rolls + " times");
    }
}
