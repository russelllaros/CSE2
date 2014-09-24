///////////////////////////
//Russell Laros
//Sep23,2014
//CSE02-hw04-IncomeTax
//This program has the user enter an positive integer 
//giving the number of seconds that have passed during the
//day and then displays the time in conventional form

import java.util.Scanner;//Importing scanner

public class TimePadding {//defining class
    public static void main(String[] args) { //main method required for java programs
    Scanner myScanner; //create new scanner
    myScanner = new Scanner( System.in ); //new scanner now can accept input
    
    System.out.print("Enter number of seconds that have passed as a an integer: ");//prompt for number of seconds
    int seconds = myScanner.nextInt();//scanner reads new integer
    
    double hours = seconds/3600;
    double hoursRoundD = Math.floor(hours);
    int hour = (int)hours;
    
    double minutesRaw = hours - hoursRoundD;
    double minutes = minutesRaw * 60;
    double minRoundD = Math.floor(minutes);
    int minute = (int)minutes;
    
    double secsRaw = minutes - minRoundD;
    double secs = secsRaw * 60;
    int second = (int)secs;
    
    System.out.format("The time is %d:%02d:%02d \n",hour,minute,second);
    
    
    
    
    }
}