package com.pluarlsight;

public class Loops {
    public static void main(String[] args) throws InterruptedException {
       //Cleared
        /* int count = 0;
        while (count < 5) {
            System.out.println("I love Java!");
            count ++;
        }*/

        //Cleared
        /*int doIt = 0;
        do {
            System.out.println("I love Java!");
            doIt++;
        } while (doIt < 5) ;*/

        //Cleared
        /*for (int i = 10; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println(i);
            if ( i == 1){
                Thread.sleep(1000);
                System.out.println("Launch!");
            }
        }*/
            
   /* May not be right, but try catch is safer than throw???
   try {
        Thread.sleep(1000);
    } catch (RuntimeException e) {
        throw new RuntimeException(e);
    }*/
        String[] schools = {"Calliet", "Cary", "Skyline", "SFASU", "TAMU"};
               // for (String school : schools) { System.out.println(school); }
        for (int i = 0; i < schools.length; i++) {
            System.out.println(schools[i]);
        }

    }
}
