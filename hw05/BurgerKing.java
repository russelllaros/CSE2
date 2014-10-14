////////////////////////
//Russell Laros
//CSE02-hw05
//9-27-14
//This program prompts the user to enter their choice of either a burger, soda, or fries
//Then asks the user details about their purcahse
import java.util.Scanner;

public class BurgerKing {//create class
    public static void main(String[] args) { //main method required for java programs
    Scanner lol; //create new scanner
    lol = new Scanner( System.in ); //creating myScanner variable so new scanner now can accept input
    
    System.out.print("Enter a letter to indicate your choice of:\n Burger(B or b)\n Fries(F or f)\n Soda(S or s)\n");
    String choice = lol.next().toUpperCase();//set variable for choice and convert entered character to upper case if not all ready
    
    
    for (int i = 0;i<1;i++){//define for loop range, ask indefinitely   
        if ("B".equals(choice)){//set if for if B is entered
            System.out.print(" Enter A or a for all the fixins\n C or c for cheese\n N or n for none of the above\n");//print line asking for toppings choice
            String toppings = lol.next().toUpperCase();//accept input using scanner and convert it to upper case if not already
            if (null != toppings)switch (toppings) {//make swith statement based on if toppings is not equal to 0
                case "A"://if A tell them they got all the toppings
                    System.out.print("You ordered a Burger with all the toppings\n");
                    break;
                case "C"://if C tell them they got cheese
                    System.out.print("You ordered a Burger with Cheese\n");
                    break;
                case "N"://if N tell them they got no toppings
                    System.out.print("You ordered no toppings on your burger\n");
                    break;
                default://if something else give warning
                    System.out.print("You did not enter in a proper character\n");
                    break;
                        
            }//close switch
        }//close if    
        else if ("F".equals(choice)){//if choice is F
            System.out.print("Do you want a large or small order of fries (l,L,s, or S)\n");//prompt for size choice
            String size = lol.next().toUpperCase();//create variable for size
            if (null != size)switch (size){//if size choice is not 0 swith statment for sie choice
                case "L"://if L tell them they got large fires
                    System.out.print("You ordered a large fries\n");
                    break;
                case "S"://if S tell them they got small fries
                    System.out.print("You ordered small fries\n");
                    break;
                default://if something else give warning
                    System.out.print("You did not enter in a proper character\n");
                    break;
        
            }//close switch
        }//close if   
        else if ("S".equals(choice)){
            System.out.print(" Do you want Pepsi (p or P)\n Coke (c or C)\n Sprite (s or S)\n Mountain Dew (M or m)\n");//prompt for size choice
            String soda = lol.next().toUpperCase();//create variable for size
            if (null != soda)switch(soda){//if size choice is not 0 swith statment for sie choice
                case "P"://if P tell them they got pepsi
                    System.out.print("You ordered a Pepsi\n");
                    break;
                case "C"://if C tell them they got coke
                    System.out.print("You ordered a Coke\n");
                    break;
                case "S"://if S tell them they got Sprite
                    System.out.print("You ordered a Sprite\n");
                    break;
                case "M"://if M tell them they got Mountain Dew
                    System.out.print("You ordered a Mountain Dew\n");
                    break;
                default://if something else give warning
                    System.out.print("You did not enter in a proper character\n");
                    break;
                }//close switch
        }//close if
        else {
            System.out.print("You did not enter a proper character\n");
        }//close else
    }//close for    
    
        
    }//end of main method    
}//end of class