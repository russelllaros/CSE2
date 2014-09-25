//////////////////////////////////
//Russell Laros
//CSE02 Lab 4
//Big Mac Tyme
//this program uses the Scanner class to obtain 
//from users how many Big Macs they want and whether they 
//want an order of fries and then prints out the total cost of the meal
import java.util.Scanner; //must import scanner to not get compiler errors

public class BigMacAgain { //adding class - public
    public static void main(String[] args) { //main method required for java programs
    Scanner myScanner; //create new scanner
    myScanner = new Scanner( System.in ); //new scanner now can accept input
    
    System.out.print("Enter number of Big Macs (an integer > 0): ");//prompt for number of big macs
    int nBigMacs = myScanner.nextInt();
    
    double priceBigMac$=2.22;
    double priceFries$=2.15;
    double priceOfBigMacs$=(nBigMacs * priceBigMac$);
    double priceOfMealMacAndFries$=(priceFries$ + priceOfBigMacs$);
    
    if (nBigMacs >= 0) {
        System.out.printf("You ordered "+nBigMacs+ " BigMacs for a total of %.2f\n", priceOfBigMacs$);
    } else if (nBigMacs < 0) {
        System.out.print("You did not enter an int > 0");
    } else {
        System.out.print("you did not eneter in a proper integer");
    }
    
    System.out.print("Would you like an order of fries? (Y,N,y,n) ");//prompt if they want fries
    String wantFries = myScanner.next();
    switch (wantFries) {
        case "Y": System.out.printf("You ordered fries at $2.15 for an order total of %.2f\n", priceOfMealMacAndFries$);
            break;
        case "y": System.out.printf("You ordered fries at $2.15 for an order total of %.2f\n", priceOfMealMacAndFries$);
            break;
        case "N": System.out.printf("You did not order fries so your order total is %.2f\n", priceOfBigMacs$);
            break;
        case "n": System.out.printf("You did not order fries so your order total is %.2f\n", priceOfBigMacs$);
            break;
        default: System.out.printf("!!Please enter in a valid character fro you choice!!\n");
            break;
    }
    
    }
}    