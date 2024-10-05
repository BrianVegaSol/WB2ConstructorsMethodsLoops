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
        int count7Rolls = 0;
        //Not necessary??? Used Dice.roll before and this was unused...
        //Was because the roll() was static
        Dice dice = new Dice();

        for (i = 1; i < 101; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            result = roll1 + roll2;
            System.out.println("Round " + i + " \n\n" +
                    "Die 1: " + roll1 + "\n" +
                    "Die 2: " + roll2 + "\n" +
                    "Result: " + result);
            System.out.println("--------------------------");
            //L e g a c y hahaaa
            /*if (roll1 == 2 || roll2 == 2) {
                count2Rolls++;
            }
            if (Dice.roll() == 4) {
                count4Rolls ++;
            }
            if (Dice.roll() == 6) {
                count6Rolls++;
            }*/

            //Never forget the breaks lol
            //switch (Dice.roll()){ Getting weird results
            switch (result){
                case 2:
                    count2Rolls ++;
                    break;
                case 4:
                    count4Rolls ++;
                    break;
                case 6:
                    count6Rolls ++;
                    break;
                case 7:
                    count7Rolls ++;
                    break;
            }
        }
        //Result Tallies
        System.out.println("#2 Rolled: " + count2Rolls + " times");
        System.out.println("#4 Rolled: " + count4Rolls + " times");
        System.out.println("#6 Rolled: " + count6Rolls + " times");
        System.out.println("#7 Rolled: " + count7Rolls + " times");
    }
}
class Dice {
    //int randomNumber = (int)(Math.random() * maxValue) + minValue;
    public int roll(){
        return (int)(Math.random() * 6) + 1;
    }
}