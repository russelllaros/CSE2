///////////////////////////
//Russell Laros
//CSE02
//Lab03
//Big Mac Cost Calculation Program
//Program will calculate cost of order of big mac(s) based on # of macs, price of macs, and sales tax
//

import java.util.Scanner; //must import scanner to not get compiler errors

public class BigMac { //adding class - public
    public static void main(String[] args) { //main method required for java programs
    Scanner myScanner; //create new scanner
    myScanner = new Scanner( System.in ); //new scanner now can accept input
    
    System.out.print("Enter number of Big Macs (an integer > 0): ");//prompt for number of big macs
    int nBigMacs = myScanner.nextInt();
    System.out.print("Enter the cost of a Big Mac as"+ "a double (in the xx.xx):");//prompt for price of big mac (to only 2 decimals)
    double bigMac$ = myScanner.nextDouble();
    System.out.print("Enter the percent tax as a whole number (xx): ");//prompt for tax percent
    double taxRate = myScanner.nextDouble();
    taxRate/=100;//user enters percent but i want proportion
    
    double cost$;
    int dollars, dimes, pennies; //can see cost in dollars, dimes, and pennies
    cost$ = nBigMacs * bigMac$ * (1+taxRate); //this will get the whole dollar amoutn dropping the fraction
    dollars=(int)cost$; //Setting up amount of dollars of change user will get back
    dimes=(int)(cost$*10) % 10; //setting up amount of dimes user will get back 
    pennies=(int)(cost$*100) % 10; //setting up amount of pennies user will get back of change
    System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per BigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies); 
    //print total cost of big macs number of big macs purchsed cost of a big mac and the sales tax
    } //end of main method
} //end of class