////////
//Russell Laros
//CSE02-hw05-BoolaBoola
//9-28-14
//This program generates three random values for 3 booleans then 
//combines them randomly with either a || or && and prints the result
import java.util.Scanner;

public class BoolaBoola {//create class

public static void main(String[] args){//create main method

Scanner lol; //create new scanner
lol = new Scanner( System.in ); //creating myScanner variable so new scanner now can accept input  
    //generated a random number, multiplied it by 2 so I get a value between 0 and 1.999
    //converted to an int so I just get either a 0 or 1
    //converted all six 1s or 0s to strings so I can use them in the Boolean
    //made the first a base number to compare other numbers to
    int randNum1 = (int)(Math.random()*10+1);
    int randNum2 = (int)(Math.random()*10+1);
    int randNum3 = (int)(Math.random()*10+1);
    int randNum4 = (int)(Math.random()*10+1);
    int randNum5 = (int)(Math.random()*10+1);
            
    Boolean one;
    Boolean two;
    Boolean three;
    Boolean expOne;
    Boolean expTwo;
   
    if (randNum1%2 == 0) {
        one = false;
    } else {
        one = true;
    }
    if (randNum2%2 == 0) {
        two = true; 
    } else {
        two = false;
    }
    if (randNum3%2 == 0) {
        three = true;
    } else {
        three = false;
    }
    if (randNum4%2 == 0) {
        expOne = true;
    } else {
        expOne = false;
    }
    if (randNum5%2 == 0) {
        expTwo = true;
    } else {
        expTwo = false;
    }

    //defining variables that will be used to 
    //supply the characters for && or ||
    String expression1;
    String expression2;
    //create if statement to check for values of earlier
    //expOne and expTwo Booleans
    //depending on satisfaction of if statement
    //either a && or a || will be randomly assignd to new Strings
    if (expOne == false) {
        expression1 = "&&";
        } else {
        expression1 = "||";
            }
    if (expTwo == false) {
        expression2 = "&&";
        } else {
        expression2 = "||";
            }
    System.out.print(one);
    System.out.print(expression1);
    System.out.print(two);
    System.out.print(expression2);
    System.out.print(three);
    
    System.out.print(" has the value true(t/T) or false(f/F)? ");
    String opt = lol.next().toUpperCase();
    if(opt.length() == 1){ 
            opt= opt+"";
            
        }else{
        System.out.println("Nope. That doesn't work");
    }
    
    boolean correct;
    
    if(one == false || two == false || three == false ) {
        
        if(opt.equals("F")) { //if they put in f or F they answer false
            correct = true; 
        }else{
            correct = false;
        }
    }else{
        if(opt.equals("T")) { //if they put in the t or T they answer True
            correct = true;
        } else {
            correct = false;
        }
    }
    if (correct) {
        System.out.println("Correct"); //Boom the output Answer
    }else{
        System.out.println("Nope. That doesn't work");
    }
    
 
    }
    
}