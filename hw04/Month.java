///////////////////////////
//Russell Laros
//Sep23,2014
//CSE02-hw04-IncomeTax
//Write a program that prompts the user to enter an integer //for the month (1 for January, 2 for February, etc.)  and then 
//displays the number of days in the month)
//If the number 2 is entered (February) the user is then asked to enter the year

import java.util.Scanner;//Importing scanner

public class Month {//defining class
    public static void main(String[] args) { //main method required for java programs
    Scanner myScanner; //create new scanner
    myScanner = new Scanner( System.in ); //new scanner now can accept input
    
    
    System.out.print("Enter an int for which month it is (1-12): ");//prompt for month
    int month = myScanner.nextInt();//set integer for month from scanner
       
        if (month>12 || month<0); {//create error message conditions for months
            System.out.println("Error! You did not put an int that corresponds to a month");
        } else; {
        int year = 0;//set variable for year
        switch (month) {//switch statement
            case 1: System.out.println("There are 31"); //set number of days
                break;
            case 2: System.out.println("Enter the year"); 
                year = myScanner.nextInt();
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {//create variable conditions for calculations for leap year
                System.out.println("There are 29 days.");//show for number of days
                return;
                } else {
                System.out.println("There are 28 days.");
                }
                break;
            case 3: System.out.println("There are 31 days "); 
                break;
            case 4: System.out.println("There are 30 days "); 
                break;
            case 5: System.out.println("There are 31 days"); 
                break;
            case 6: System.out.println("There are 30 days");
                break;
            case 7: System.out.println("There are 31 days"); 
                break;
            case 8: System.out.println("There are 31 days"); 
                break;
            case 9: System.out.println("There are 30 days");
                break;
            case 10: System.out.println("There are 31 days"); 
                break;
            case 11: System.out.println("There are 30 days"); 
                break;
            case 12: System.out.println("There are 30 days"); 
                break;
            default: 
                break;
            }
    
        }
    }//end of main method
}//end of class