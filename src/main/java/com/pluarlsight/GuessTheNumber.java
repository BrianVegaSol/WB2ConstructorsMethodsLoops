package com.pluarlsight;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10) + 1;
        int guessedNumber;
        final int MAX_NUMBER = 10;
        final int MAX_ATTEMPTS = 5;
        int guessCounter = 1;

        do {
            System.out.println("What number do I have in mind?");
            guessedNumber = reader.nextInt();
            //Breaks code early if guess is right to prevent guesses left from displaying + Win message
            if (randomNumber == guessedNumber) {
                System.out.println("You Won!\n");
                break;
            }

            if (guessedNumber < randomNumber) {
                System.out.println("Too low");
            }
            if (guessedNumber > randomNumber) {
                System.out.println("Too high");
            }
            //Lose condition is met
            if ((guessCounter) >= MAX_ATTEMPTS) {
                System.out.println("-----------------------");
                System.out.println("Sorry! You Lost!\n");
                break;
            }
            guessCounter ++;
            //Remove if correct. Use a method? Just use an if() to break code early if answer is right
            System.out.println((MAX_ATTEMPTS - (guessCounter) + 1) + " guesses remain!");
            //randomNumber < 10 && randomNumber > 1 not necessary
        } while (randomNumber != guessedNumber);
        System.out.println("The number I was thinking of was: " + randomNumber);
        System.out.println("You guessed: " + guessCounter + " times!");
    }
    }


