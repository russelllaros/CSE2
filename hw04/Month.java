///////////////////////////
//Russell Laros
//Sep23,2014
//CSE02-hw04-IncomeTax
//This program prompts the user to enter an int that 
//is the thousands of dollars of income and then writes 
//out the amount of tax on the income, given the following 
//schedule:  <20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%

import java.util.Scanner;//Importing scanner

public class Month {//defining class
    public static void main(String[] args) { //main method required for java programs
    Scanner myScanner; //create new scanner
    myScanner = new Scanner( System.in ); //new scanner now can accept input
    
    
    System.out.print("Enter an int for which month it is (1-12): ");
    int month = myScanner.nextInt();
        String monthString;
        switch (month) {
            case 1:  monthString = "There are 31 days in the month";
                break;
            case 2:  monthString = "There are 28 days in the month";
                break;
            case 3:  monthString = "There are 31 days in the month";
                break;
            case 4:  monthString = "There are 30 days in the month";
                break;
            case 5:  monthString = "There are 31 days in the month";
                break;
            case 6:  monthString = "There are 30 days in the month";
                break;
            case 7:  monthString = "There are 31 days in the month";
                break;
            case 8:  monthString = "There are 31 days in the month";
                break;
            case 9:  monthString = "There are 30 days in the month";
                break;
            case 10:  monthString = "There are 31 days in the month";
                break;
            case 11:  monthString = "There are 30 days in the month";
                break;
            case 12:  monthString = "There are 31 days in the month";
                break;
        
            }
            System.out.println(monthString);
        
    }
}