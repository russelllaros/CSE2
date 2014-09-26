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
    int nBigMacs = myScanner.nextInt();//set scanner to read int entered above
    
    double priceBigMac$=2.22;//make variabe for price of BigMac
    double priceFries$=2.15;//make variable for price of Fries
    double priceOfBigMacs$=(nBigMacs * priceBigMac$);//make variable that is price of bigmcs times number of BMs ordered
    double priceOfMealMacAndFries$=(priceFries$ + priceOfBigMacs$);//make variable that is total of order BMs plus order of fries
    
    if (nBigMacs >= 0) {//set if oder is 0 or greater print order total of BMs
        System.out.printf("You ordered "+nBigMacs+ " BigMacs for a total of %.2f\n", priceOfBigMacs$);
    } else if (nBigMacs < 0) { //set if else number of BMs is less than one print improper int statement
        System.out.print("You did not enter an int > 0");
    } else { //else cannot be an int print you did not enter an int
        System.out.print("you did not eneter in a proper integer");
    }
    
    System.out.print("Would you like an order of fries? (Y,N,y,n) ");//prompt if they want fries
    String wantFries = myScanner.next();//read string variable that was entered
    switch (wantFries) { //set switch statement using wantFries variable
        case "Y": System.out.printf("You ordered fries at $2.15 for an order total of %.2f\n", priceOfMealMacAndFries$);//case "Y" print price of BMs ordered plus fries
            break;
        case "y": System.out.printf("You ordered fries at $2.15 for an order total of %.2f\n", priceOfMealMacAndFries$);//case "y" print price of BMs ordered plus fries
            break;
        case "N": System.out.printf("You did not order fries so your order total is %.2f\n", priceOfBigMacs$);//case "N" print just price of BMs ordered
            break;
        case "n": System.out.printf("You did not order fries so your order total is %.2f\n", priceOfBigMacs$);//case "n" print just price of BMs ordered
            break;
        default: System.out.printf("!!Please enter in a valid character for you choice!!\n");//something else entered print that you done effed up
            break;
    }
    
    }
}    