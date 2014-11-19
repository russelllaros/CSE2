//Russell Laros
//CSE02-HW10-PokerOdds
//11-18-14
//this program generates a random hand of poker
//then genrates 1000 random hands and finds how many matches of each kind of card there is, plus no mathces at all

import java.util.Random;//import random
import java.util.Scanner;//import scanner so we can ask for input in first method

public class PokerOdds {

    public static void main(String[] args) {//main method that calls to other methods
        showHands();//method to generate hand
        simulateOdds();//method to simulate 1000 random hands
    }

    public static void showHands() {//method to simulate random poker hand
        String again = "";//create string to take input of variable in order to go again
        do {//start do
            String card[] = new String[52];//create new array of 52 to simulate a deck
            String hearts[] = new String[52];//create a string array for the heart suit 
            String diamonds[] = new String[52];//diamond suit
            String spades[] = new String[52];//spade suit
            String clubs[] = new String[52];// club suit

            for (int i = 0; i < card.length; i++) {//assigning which card is which based on poisition in the deck
                if (i == 0 || i == 1 || i == 2 || i == 3) {//for example if it is between 0-3 its a 2
                    card[i] = "2";
                }
                if (i == 4 || i == 5 || i == 6 || i == 7) {//between 4-7 its a 3 etc.
                    card[i] = "3";
                }
                if (i == 8 || i == 9 || i == 10 || i == 11) {
                    card[i] = "4";
                }
                if (i == 12 || i == 13 || i == 14 || i == 15) {
                    card[i] = "5";
                }
                if (i == 16 || i == 17 || i == 18 || i == 19) {
                    card[i] = "6";
                }
                if (i == 20 || i == 21 || i == 22 || i == 23) {
                    card[i] = "7";
                }
                if (i == 24 || i == 25 || i == 26 || i == 27) {
                    card[i] = "8";
                }
                if (i == 28 || i == 29 || i == 30 || i == 31) {
                    card[i] = "9";
                }
                if (i == 32 || i == 33 || i == 34 || i == 35) {
                    card[i] = "10";
                }
                if (i == 36 || i == 37 || i == 38 || i == 39) {
                    card[i] = "J";
                }
                if (i == 40 || i == 41 || i == 42 || i == 43) {
                    card[i] = "Q";
                }
                if (i == 44 || i == 45 || i == 46 || i == 47) {
                    card[i] = "K";
                }
                if (i == 48 || i == 49 || i == 50 || i == 51) {
                    card[i] = "A";
                }

            }

            for (int j = 0; j < 5; j++) {//create hand of 5 random cards
                Random random = new Random();//create new random

                int rand = (int) (Math.random() * 4) + 1;//make a random number to run through the suits

                if (rand == 1) {//if random number is 1 run through the hearts suit, etc. for the rest of the suits
                    hearts[j] = card[random.nextInt(card.length)];
                }
                if (rand == 2) {
                    diamonds[j] = card[random.nextInt(card.length)];
                }
                if (rand == 3) {
                    spades[j] = card[random.nextInt(card.length)];
                }
                if (rand == 4) {
                    clubs[j] = card[random.nextInt(card.length)];
                }

            }
            System.out.print("Clubs:");//printing the clubs, and then any of the corresponding cards selected randomly afterward
            for (int i = 0; i < clubs.length; i++) {
                if (clubs[i] == null || clubs[i].equals("-1")) {
                    continue;
                } else {
                    System.out.print(clubs[i] + " ");
                }
            }
            System.out.println();//print a line down to it gives the proper structure when printed
            System.out.print("Diamonds:");//doing same as clubs jsut with the diamonds arrays and variables
            for (int i = 0; i < diamonds.length; i++) {
                if (diamonds[i] == null || diamonds[i].equals("-1")) {
                    continue;
                } else {
                    System.out.print(diamonds[i] + " ");
                }
            }
            System.out.println();
            System.out.print("Hearts:");//same as above code just with hearts this time
            for (int i = 0; i < hearts.length; i++) {
                if (hearts[i] == null || hearts[i].equals("-1")) {
                    continue;
                } else {
                    System.out.print(hearts[i] + " ");
                }
            }
            System.out.println();
            System.out.print("Spades:");
            for (int i = 0; i < spades.length; i++) {
                if (spades[i] == null || spades[i].equals("-1")) {
                    continue;
                } else {
                    System.out.print(spades[i] + " ");
                }
            }

            System.out.println();//print a line down again so the print line asking to go again is downa line

            Scanner dong = new Scanner(System.in);//create a new scanner

            System.out.print("Go again? press y or Y (anything else to quit): ");//ask for an input

            again = dong.next();//reassign value of input to the variable again

        } while (again.equals("y") || again.equals("Y"));//check if the inputted characters were a y ot Y, if they are go again

    }//close method

    public static void simulateOdds() {//ok so I could not figure out how to do this method
        //so far I jsut put the code to make 1 hand in a for loop to run 1000 hands
        for(int runs=0;runs<1000;runs++){//
            String card[] = new String[52];//create new array of 52 to simulate a deck
            String hearts[] = new String[52];//create a string array for the heart suit 
            String diamonds[] = new String[52];//diamond suit
            String spades[] = new String[52];//spade suit
            String clubs[] = new String[52];// club suit

            for (int i = 0; i < card.length; i++) {//assigning which card is which based on poisition in the deck
                if (i == 0 || i == 1 || i == 2 || i == 3) {//for example if it is between 0-3 its a 2
                    card[i] = "2";
                }
                if (i == 4 || i == 5 || i == 6 || i == 7) {//between 4-7 its a 3 etc.
                    card[i] = "3";
                }
                if (i == 8 || i == 9 || i == 10 || i == 11) {
                    card[i] = "4";
                }
                if (i == 12 || i == 13 || i == 14 || i == 15) {
                    card[i] = "5";
                }
                if (i == 16 || i == 17 || i == 18 || i == 19) {
                    card[i] = "6";
                }
                if (i == 20 || i == 21 || i == 22 || i == 23) {
                    card[i] = "7";
                }
                if (i == 24 || i == 25 || i == 26 || i == 27) {
                    card[i] = "8";
                }
                if (i == 28 || i == 29 || i == 30 || i == 31) {
                    card[i] = "9";
                }
                if (i == 32 || i == 33 || i == 34 || i == 35) {
                    card[i] = "10";
                }
                if (i == 36 || i == 37 || i == 38 || i == 39) {
                    card[i] = "J";
                }
                if (i == 40 || i == 41 || i == 42 || i == 43) {
                    card[i] = "Q";
                }
                if (i == 44 || i == 45 || i == 46 || i == 47) {
                    card[i] = "K";
                }
                if (i == 48 || i == 49 || i == 50 || i == 51) {
                    card[i] = "A";
                }

            }

            for (int j = 0; j < 5; j++) {//create hand of 5 random cards
                Random random = new Random();//create new random

                int rand = (int) (Math.random() * 4) + 1;//make a random number to run through the suits

                if (rand == 1) {//if random number is 1 run through the hearts suit, etc. for the rest of the suits
                    hearts[j] = card[random.nextInt(card.length)];
                }
                if (rand == 2) {
                    diamonds[j] = card[random.nextInt(card.length)];
                }
                if (rand == 3) {
                    spades[j] = card[random.nextInt(card.length)];
                }
                if (rand == 4) {
                    clubs[j] = card[random.nextInt(card.length)];
                }
            }
        }

    }//end method

}
