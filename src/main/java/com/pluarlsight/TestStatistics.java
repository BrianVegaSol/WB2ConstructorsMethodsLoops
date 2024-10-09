package com.pluarlsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setName("Dave");
        p1.setAge(20);
        //p1.printInfo();
        //p1.forLoops();
        //p1.showInfoXTimes(10);

        //-	fill()  -  Fills an array with a specific value
        //-	equals()  -  Compares two arrays to determine if they are equal
        //-	binarySearch()  -  Efficiently searches an ordered array for a specific value to find out where it is located

        int[] testScores = {50, 86, 75, 74, 94, 32, 64, 48, 57, 24};

        //Sort array from least to greatest
        Arrays.sort(testScores);
        System.out.println(Arrays.toString(testScores));
       //Average
        int sum = 0;
        for (int avg : testScores) {
            sum += avg;
        }
        //System.out.println(sum);
        int average = sum/testScores.length;
        int median = (testScores.length) / 2;
        System.out.println("Average test score was: " + average);
        System.out.println("Highest test score was: " + (testScores[9]));
        System.out.println("Lowest test score was: " + testScores[0]);
        System.out.println(median);

        Arrays.fill(testScores, 45);

        //Another solution using Streams
        /*int[] testScores = {100, 63, 94, 88, 55, 100, 98, 80, 90, 73};
        System.out.println("Avarage test score: " + Arrays.stream(testScores).average().getAsDouble());
        System.out.println("Highest grade: " + Arrays.stream(testScores).max().getAsInt());
        System.out.println("Lowest grade: " + Arrays.stream(testScores).min().getAsInt());*/






       /*for (int i = 1; i <= p1.getAge(); i++) {
            if (i == 1){
                System.out.println("Person1's name is " + p1.getName() + " and he or she is " + i + " year old");
            } else {
                System.out.println("Person1's name is " + p1.getName() + " and he or she is " + i + " years old");
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi, " + p1.getName() + " is " + p1.getAge() + " years old...");
        }*/


    }


}

class Person1 {
    private String name;
    private int age;

    public Person1() {
    }

    //Also works if used like: Person1 p1 = new Person1("Dave", 20);
    //No need for setting in main,just ^ & printInfo();
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //If above method used, no need for setters since they were prefilled
    //Only need setters when giving the user ability to input this themselves via scanners
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Person1's name is " + getName() + "and he or she is " + getAge() + " years old");
    }

    public void forLoops() {
        for (int i = 1; i <= getAge(); i++) {
            if (i == 1){
                System.out.println("Person1's name is " + getName() + " and he or she is " + i + " year old");
            } else {
                System.out.println("Person1's name is " + getName() + " and he or she is " + i + " years old");
            }
        }

    }
     public void showInfoXTimes(int times){
         for (int i = 0; i < times; i++) {
             System.out.println("Hi, " + getName() + " is " + getAge() + " years old...");
         }
     }

}