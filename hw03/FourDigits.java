/////////////////////
//Russell Laros
//CSE02
//Hw03 Four Digits Program
//Write a program that prompts the user to enter a double 
//and then prints out the first four digits to the right 
//of the decimal point
import java.util.Scanner; //importing scanner

public class FourDigits { //public class
    public static void main(String[] args) { //main method
    Scanner myScanner; //creating scanner
    myScanner = new Scanner( System.in ); //setting up scanner

    System.out.print("Enter number xx.xxxx");//prompt for number
    double number = myScanner.nextDouble();//setting scanner up
    int firstInt = (int) number; //creating variable for the first integer
    int firstMult = firstInt * 10000; //multiplying number by 10000
    double secondMult = number * 10000; //multiplying  by 10000
    int secondInt = (int) secondMult;//setting up second integer from original number
    int answer = secondInt - firstMult;//setting up variable for final answer
    
    System.out.printf("The four digit number is %04d%n",answer);//printing to 4 digits

    }
}