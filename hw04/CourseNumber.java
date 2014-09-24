///////////////////////////
//Russell Laros
//Sep23,2014
//CSE02-hw04-IncomeTax
//The semester during which a course is offered at Lehigh 
//is given by a 6 digit number. The first four digits give 
//the year, and the last two digits give the semester: 10 spring, 
//20 summer 1, 30 summer 2, and 40 fall. Write a program that reads 
//in a 6 digit number, makes sure that it adheres to the above description, 
//and then prints out the semester and year

import java.util.Scanner;//Importing scanner

public class CourseNumber {//defining class
    public static void main(String[] args) { //main method required for java programs
    Scanner myScanner; //create new scanner
    myScanner = new Scanner( System.in ); //new scanner now can accept input
    
    System.out.print("Enter an int for which course: ");
    int courseNum = myScanner.nextInt();
        if (Integer.toString(courseNum).length() > 6) {
        System.out.print("Please enter correct number of numbers");
        
        } else if (courseNum < 186510 || courseNum >201440) {
            System.out.print("You entered an invalid number");
            } else {
                String year = Integer.toString(courseNum).substring(0,4);
                String term = Integer.toString(courseNum).substring(4,6);
                switch (term) {
                    case "10": term = "The course you selected is spring, "+year+"";
                        break;
                    case "20": term = "The course you selected is summer 1, "+year+"";
                        break;
                    case "30": term = "The course you selected is summer 2, "+year+"";
                       break;
                    case "40": term = "The course you selected is fall, "+year+"";
                        break;    
                    default: term = "that is an invalid term number";
                        break;
                }
            }
            System.out.println( term);
    }
}    