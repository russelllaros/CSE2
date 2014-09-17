/////////////////////
//Russell Laros
//CSE02
//Hw03 Root Program
//  This program will prompt the user to enter a double 
//  and then print out a crude estimate of the cube root of 
//  the number and the value of this crude guess when cubed

import java.util.Scanner; //must import scanner to not get compiler errors

public class Root { //adding class - public
    public static void main(String[] args) { //main method required for java programs
    Scanner myScanner; //create new scanner
    myScanner = new Scanner( System.in ); //new scanner now can accept input

    System.out.print("Enter number you wish to cube: ");//prompt for number of counts
    double x = myScanner.nextDouble();
    
    double guess=x/3;
    double guess2= (2*guess*guess*guess*x)/(3*guess*guess);
    double guess3= (2*guess2*guess2*guess2*x)/(3*guess2*guess2);
    double guess4= (2*guess3*guess3*guess3*x)/(3*guess3*guess3);
    double guess5= (2*guess4*guess4*guess4*x)/(3*guess4*guess4);
    double guess6= (2*guess5*guess5*guess5*x)/(3*guess5*guess5);
    
    System.out.printf("The cube root is %f", guess6);
    System.out.printf(": %f * %f * %f =", guess6);
    System.out.printf("%f", guess6*guess6*guess6);
    
    }
}