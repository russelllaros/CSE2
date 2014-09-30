////////
//Russell Laros
//CSE02-hw05-BoolaBoola
//9-28-14
//This program generates three random values for 3 booleans then 
//combines them randomly with either a || or && and prints the result

public class BoolaBoola {//create class

public static void main(String[] args){//create main method

    //generated a random number, multiplied it by 2 so I get a value between 0 and 1.999
    //converted to an int so I just get either a 0 or 1
    //converted all six 1s or 0s to strings so I can use them in the Boolean
    //made the first a base number to compare other numbers to
    String base = Integer.toString((int)(Math.random()*2));
    String number1 = Integer.toString((int)(Math.random()*2));
    String number2 = Integer.toString((int)(Math.random()*2));
    String number3 = Integer.toString((int)(Math.random()*2));
    String number4 = Integer.toString((int)(Math.random()*2));
    String number5 = Integer.toString((int)(Math.random()*2));

    //set my Boolean variables
    Boolean one = false;
    Boolean two = false;
    Boolean three = false;
    Boolean expOne = false;
    Boolean expTwo = false;
    
    //if the two random numbers generated are equal then a false value is generated
    //if the two random numbers generated are not equal then a true value is generated
    one = number1.equals (base);
    two = number2.equals (base);
    three = number3.equals (base);
    expOne = number4.equals (base);
    expTwo = number5.equals (base);
    
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
    //print each random value in a normal print statement so they are together
    //but make the last line a print line statement so the command input line goes down a line
    System.out.print(one);
    System.out.print(expression1);
    System.out.print(two);
    System.out.print(expression2);
    System.out.println(three);
    
    }//end of main method
    
}//end of class