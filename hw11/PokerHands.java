//Russell laros
//cse2
//hw11
//pokerhands program
//12-5-14
//this program takes input from the user asking for the suit and rank of the a hadn of cards
// it then displays the cards adn then should tell the user what kind of hand it is

import java.util.Scanner;//import scanner to take input
import java.util.Arrays;//so i can do array checks like Array.sort

public class PokerHands {

    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        System.out.print("Go again?(enter Y or y to continue again): ");//ask to go
        String answer = scanMe.next();
        int[] hand = new int[5];//create deck and hand arrays
        int[] deck = new int[52];
        for (int i = 0; i < 52; i++) {//input numbers from 0-51 into deck
            deck[i] = i + 1;
        }
        while ("Y".equals(answer) || "y".equals(answer)) {//do the loop while the user keeps pressing y or Y
        
            for (int i = 0; i < 5; i++) {//do the whole process a total of 5 times
                int dupChk = 0;
                do {//do

                    int check = 0;
                    int face = 0;
                    Scanner scan = new Scanner(System.in);
                    String suit;
                    String card;
                    do {
                        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");//ask for input
                        suit = scan.next();
                        if (null != suit) {//do a switch and assign values to each of the suits chosen
                            switch (suit) {
                                case "c":
                                    face = 0;
                                    check = 0;
                                    break;
                                case "d":
                                    face = 13;
                                    check = 0;
                                    break;
                                case "h":
                                    face = 26;
                                    check = 0;
                                    break;
                                case "s":
                                    face = 39;
                                    check = 0;
                                    break;
                                default:
                                    System.out.println("You did not enter a valid response");
                                    check = 1;
                                    break;
                            }
                        }
                    } while (check == 1);
                    do {
                        System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");//do the same for the ranks
                        card = scan.next();

                        if (null != card) {
                            switch (card) {
                                case "a":
                                    check = 0;
                                    hand[i] = 0 + face;
                                    break;
                                case "k":
                                    check = 0;
                                    hand[i] = 1 + face;
                                    break;
                                case "q":
                                    check = 0;
                                    hand[i] = 2 + face;
                                    break;
                                case "j":
                                    check = 0;
                                    hand[i] = 3 + face;
                                    break;
                                case "10":
                                    check = 0;
                                    hand[i] = 4 + face;
                                    break;
                                case "9":
                                    check = 0;
                                    hand[i] = 5 + face;
                                    break;
                                case "8":
                                    check = 0;
                                    hand[i] = 6 + face;
                                    break;
                                case "7":
                                    check = 0;
                                    hand[i] = 7 + face;
                                    break;
                                case "6":
                                    check = 0;
                                    hand[i] = 8 + face;
                                    break;
                                case "5":
                                    check = 0;
                                    hand[i] = 9 + face;
                                    break;
                                case "4":
                                    check = 0;
                                    hand[i] = 10 + face;
                                    break;
                                case "3":
                                    check = 0;
                                    hand[i] = 11 + face;
                                    break;
                                case "2":
                                    check = 0;
                                    hand[i] = 12 + face;//adding the fave value will make it equal to its position in the deck
                                    break;
                                default:
                                    check = 1;
                                    System.out.println("You did not enter a valid response");
                                    break;
                            }
                        }
                    } while (check == 1);
                    for (int j = 0; j < i; j++) {
                        if (hand[j] == hand[i]) {
                            dupChk = 1;
                            System.out.println("You already entered that - try again");
                        } else {
                            dupChk = 0;
                        }
                    }
                } while (dupChk == 1);
            }

            showOneHand(hand);
            tellHand(hand);
            System.out.print("Go again?(enter Y or y to continue again): ");
            answer = scanMe.next();
        }
    }

    public static void showOneHand(int hand[]) {//print the hadn you chose
        String suit[] = {"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "};
        String out = "";

        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++) {
                for (int card = 0; card < 5; card++) {
                    if (hand[card] / 13 == s && hand[card] % 13 == rank) {
                        out += face[rank];
                        out += '\n';
                    }
                }
            }
            System.out.println();
        }
        System.out.print(out);
        System.out.println();
    }

    public static void tellHand(int[] hand) {//method to tell you which hand you chose
        int oneTimeF=0;
        int hC=0;
        if(sFlush(hand)==1){//each if is asking for input back from the corresponding method
            System.out.println("Straight Flush");
            oneTimeF=1;
            hC=1;
        }
        if(sFlush(hand)==2){
            System.out.println("Royal Flush");
            oneTimeF=1;
            hC=1;
        }
        if(foak(hand)==true){
            System.out.println("Four of a kind");
            hC=1;
        }
        if(fh(hand)==true){
            System.out.println("Full House");
            hC=1;
        }
        if(flush(hand)==true && oneTimeF==0){
            System.out.println("Flush");
            hC=1;
        }
        if(straight(hand)==4 && oneTimeF==0){
            System.out.println("Straight");
            hC=1;
        }
        if(pairs(hand)==1){
            System.out.println("One pair");
            hC=1;
        }
        if(pairs(hand)==2){
            System.out.println("Two pair");
            hC=1;
        }
        if(hC==0) {
            System.out.println("High Card");
        }
        
        
    }
    
    public static int sFlush(int[] hand){//checks and logic for both a straight fluch and royal flush
        int omg=0;
        int check=0;
        int checkF=0;
        int[] suit=new int[5];
        int[] face=new int[5];
        for (int i=0;i<hand.length;i++){
            suit[i] = hand[i] / 13;
        }
        for (int i=0;i<hand.length;i++){
            face[i]=hand[i] % 13;
        }
        for (int j = 0; j < suit.length; j++) {
            for (int k = j + 1; k < suit.length; k++) {
                if (k != j && suit[k] == suit[j]) {
                    check++;
                }
            }
        }
        for (int j = 0; j < suit.length; j++) {
            for (int k = j + 1; k < suit.length; k++) {
                if (k != j && face[k]+1 == face[j]) {
                    checkF++;
                }
            }
        }
        if(check==10 && checkF==4){
            omg=1;
        }
        Arrays.sort(face);
        if(check==10 && checkF==4 && face[0]==0){
            omg=2;
        }
        return omg;
    }
    
    public static boolean foak(int[] hand){//logic for a four of a kind
        boolean check=false;
        int match = 0;
        for (int i = 0; i < hand.length; i++) {
            hand[i] = hand[i] % 13;
        }
        for (int j = 0; j < hand.length; j++) {
            for (int k = j + 1; k < hand.length; k++) {
                if (k != j && hand[k] == hand[j]) {
                    match++;//if there are duplicates add to counter
                }
            }
        }
        if(match==6){//for some reason counter ends up being six if theres four
            check=true;
        }
        return check;
    }
    
    public static boolean fh(int[] hand){//logic for full house
        boolean check=false;
        int match = 0;
        for (int i = 0; i < hand.length; i++) {
            hand[i] = hand[i] % 13;
        }
        for (int j = 0; j < hand.length; j++) {
            for (int k = j + 1; k < hand.length; k++) {
                if (k != j && hand[k] == hand[j]) {
                    match++;
                }
            }
        }
        if(match==4){
            check=true;
        }
        return check;
    }
    
    public static boolean flush(int[] hand){//flush
        boolean check=false;
        int m=0;
        int[] suit=new int[5];
        int[] face=new int[5];
        for (int i=0;i<hand.length;i++){
            suit[i] = hand[i] / 13;
        }
        for (int j = 0; j < suit.length; j++) {
            for (int k = j + 1; k < suit.length; k++) {
                if (k != j && suit[k] == suit[j]) {
                    m++;
                }
            }
        }
        if(m==10){
            check=true;
        }
        return check;
    }
    
    public static int straight(int[] hand){//straight
        int check=0;
        int[] face=new int[5];
        for (int i=0;i<hand.length;i++){
            face[i]=hand[i] % 13;
        }
        for (int j = 0; j < face.length; j++) {
            for (int k = j + 1; k < face.length; k++) {
                if (k != j && face[k]+1 == face[j]) {
                    check++;
                }
            }
        }
        return check;
    }
    
    public static int pairs(int[] hand){//check for duplicates and return if there are more then one pair
        int match = 0;
        for (int i = 0; i < hand.length; i++) {
            hand[i] = hand[i] % 13;
        }
        for (int j = 0; j < hand.length; j++) {
            for (int k = j + 1; k < hand.length; k++) {
                if (k != j && hand[k] == hand[j]) {
                    match++;
                }
            }
        }
        return match;//return the value
    }
            

}