/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rolldices;

import java.util.Random;
import java.util.Scanner;

/**
 * @author robot
 */
public class RollDices {

    public static int rollDices() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int lives = 5, dice1, dice2, sum;
        int throwCount = 0;
        int totalEven = 0, totalOdd = 0, totalEqual = 0;
        int consecutiveEqual = 0, lastEqualValue = -1;
        String player_name, key;

        System.out.println("::: WELCOME TO ROLL DICES :::");
        System.out.print("Your player name: ");
        player_name = data.nextLine();
        System.out.println("\nPress ENTER to start the game !!!");
        key = data.nextLine();

        boolean playing = true;

        while (playing) {
            throwCount++;
            dice1 = rollDices();
            dice2 = rollDices();
            sum = dice1 + dice2;

            System.out.println("\nL" + throwCount + " | Dice1: " + dice1 + " | Dice2: " + dice2 + " | Sum: " + sum);

            
            if (dice1 == dice2) {
                totalEqual++;
                if (dice1 == lastEqualValue) {
                    consecutiveEqual++;
                } else {
                    consecutiveEqual = 1;
                    lastEqualValue = dice1;
                }
                System.out.println("Equal dice! Streak: " + consecutiveEqual + "/3");

                if (dice1 == 6) {
                    lives++;
                    System.out.println("Double 6! Extra life! Lives: " + lives);
                }
            } else {
                consecutiveEqual = 0;
                lastEqualValue = -1;
            }

            
            if (sum % 2 == 0) {
                totalEven++;
                System.out.println("Even sum -> Game continues.");
            } else {
                totalOdd++;
                lives--;
                System.out.println("Odd sum -> You lose a life! Lives: " + lives);
            }

            
            if (consecutiveEqual >= 3) {
                System.out.println("\nYOU WIN!");
                playing = false;
            } else if (lives <= 0) {
                System.out.println("\nGAME OVER");
                playing = false;
            } else {
                System.out.print("\nPress ENTER to roll again...");
                data.nextLine();
            }
        }

        
        System.out.println("\n--- FINAL REPORT: " + player_name + " ---");
        System.out.println("Total throws          : " + throwCount);
        System.out.println("Throws with even sum  : " + totalEven);
        System.out.println("Throws with odd sum   : " + totalOdd);
        System.out.println("Throws with equal dice: " + totalEqual);

        data.close();
    }
}