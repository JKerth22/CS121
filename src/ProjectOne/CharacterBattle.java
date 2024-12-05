package ProjectOne;

import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many rounds?(Use an odd number)");
        final int numRounds = scnr.nextInt();
        int points1 = 0;
        int points2 = 0;
        for (int i = 0; i < numRounds; i++) {
            System.out.println("Character 1: ");
            System.out.println("Enter the name(one word) of the character: ");
            String name1 = scnr.next();
            System.out.println("Enter the HP of the character: ");
            int hitPoints1 = scnr.nextInt();
            System.out.println("Enter the move(one word) of the character: ");
            String move1 = scnr.next();
            System.out.println("Enter the move's power: ");
            int power1 = scnr.nextInt();
            System.out.println("Enter the attack speed of the character: ");
            int attackSpeed1 = scnr.nextInt();
            System.out.println("Character 2: ");
            System.out.println("Enter the name(one word) of the character: ");
            String name2 = scnr.next();
            System.out.println("Enter the HP of the character: ");
            int hitPoints2 = scnr.nextInt();
            System.out.println("Enter the move(one word) of the character: ");
            String move2 = scnr.next();
            System.out.println("Enter the move's power: ");
            int power2 = scnr.nextInt();
            System.out.println("Enter the attack speed of the character: ");
            int attackSpeed2 = scnr.nextInt();

            while (hitPoints1 > 0 && hitPoints2 > 0) {
                if (attackSpeed1 > attackSpeed2) {
                    hitPoints2 = hitPoints2 - power1;
                    if (hitPoints2 < 1) {
                        System.out.println("Player 1 wins: ");
                        points1++;
                    }
                    hitPoints1 = hitPoints1 - power2;
                    if (hitPoints1 < 1 && hitPoints2 > 0) {
                        System.out.println("Player 2 wins: ");
                        points2++;
                    }
                }
                else if(attackSpeed1 < attackSpeed2) {
                    hitPoints1 = hitPoints1 - power2;
                    if (hitPoints1 < 1) {
                        System.out.println("Player 2 wins: ");
                        points2++;
                    }
                    hitPoints2 = hitPoints2 - power1;
                    if (hitPoints2 < 1 && hitPoints1 > 0) {
                        System.out.println("Player 1 wins: ");
                        points1++;
                    }
                }
                else{
                    if(Math.random() < 0.5){
                        hitPoints2 = hitPoints2 - power1;
                        if (hitPoints2 < 1) {
                            System.out.println("Player 1 wins: ");
                            points1++;
                        }
                        hitPoints1 = hitPoints1 - power2;
                        if (hitPoints1 < 1 && hitPoints2 > 0) {
                            System.out.println("Player 2 wins: ");
                            points2++;
                        }
                    }
                    else{
                        hitPoints1 = hitPoints1 - power2;
                        if (hitPoints1 < 1) {
                            System.out.println("Player 2 wins: ");
                            points2++;
                        }
                        hitPoints2 = hitPoints2 - power1;
                        if (hitPoints2 < 1 && hitPoints1 > 0) {
                            System.out.println("Player 1 wins: ");
                            points1++;
                        }
                    }
                }
            }
        }
        System.out.println("Final Score:\n Player one: " + points1 + "\n Player two: " + points2);
        if (points1 > points2) {
            System.out.println("Player 1 wins the battle.");
        }
        else{
            System.out.println("Player 2 wins the battle.");
        }
    }

    }
