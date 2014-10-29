//////////////////////
//Russell Laros
//CSE02-HW8
//10-26-14
//
import java.util.Scanner;//import scanner so we can take values from the user
public class HW8 {//declare the class
  public static void main(String []arg){//declare the main method
        char input;//create variable for input
	Scanner scan=new Scanner(System.in);//create scanner variable
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");//ask for the input for the first method
	input=getInput(scan,"Cc");//outsource the variable to the first non-main method
        System.out.println("You entered '"+input+"'");//after commands in first method are executed print out retuened value
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//ask for characters
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");//print out returned input
	}
    System.out.println("Choose a digit.\nEnter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }//close main method
  public static char getInput(Scanner scan,String input){//declare second method for first inputs
      char userInput = scan.next().charAt(0);////declare a variable to store the char from the string in, "charAT" will convert the string to a char
      char response = 0;//create a variable to transpose correct response to when proper conditions are satisfied
        if(userInput == 'C' || userInput == 'c'){//if correct
            response = userInput;//assign the input char to the response variable
        }
        else{//else
            while('C' != userInput && 'c' != userInput){//keep running the while loop if the improper value keeps being entered
                System.out.print("You did not enter a character from the list 'Cc'; try again- ");//ask for new value
                userInput = scan.next().charAt(0);//assign entered character(s) to variable
                response = userInput;//assign inputted value to the value being returned for when the while statement is declared void
            }//close while
        }//close else
      return response;//return the character
  }//close method 1
  public static char getInput(Scanner scan,String string,int shaft){//create second method
      char fudge = scan.next().charAt(0);//import the string into a char that can be returned
      char response=0;//create the response variable
      int i= 0;//create counter variable
      for(i=1;i<shaft;i++){//run when the counter is less than the int shaft, or 5
          if(fudge == 'Y' || fudge == 'y' || fudge == 'N' || fudge == 'n'){//if the characters match the Y,y,N,n
          i=shaft;//if the if is satisfied set the counter to 5 and break out of the for loop
          response = fudge;//set the response varible to the character entered so it will be returned
          }
          else{//else give an error statement
          System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
          fudge = scan.next().charAt(0);//set the 
          response = fudge;
          }
      }
      if(i==shaft){//if the for is satisfied print that you failed 5 times
          System.out.println("You failed to input the correct value 5 times");
      }
      return response;//return the inputted character that is still in the response
  }
  public static char getInput(Scanner sh,String strang, String number){//third method
      char userInput = 0;//most is same as first method
      char response = 0;
      userInput = sh.next().charAt(0);
      if(userInput == '0' || userInput == '1' || userInput == '2' || userInput == '3' || userInput == '4' || userInput == '5' || userInput == '6' || userInput == '7' ||userInput == '8' || userInput == '9'){//had to do if for all 10 characters because a switch doesnt work, char cannot be converted to a string
            response = userInput;//set charachter inputed to the repsonse varible that will be returned
        }
        else{//same as first method, just checking for the 0-9 characters
            while(userInput != '0' && userInput != '1'&& userInput != '2' && userInput != '3' && userInput != '4' && userInput != '5' && userInput != '6' && userInput != '7' && userInput != '8' && userInput != '9'){
                System.out.print("You did not enter a character from the list 'Cc'; try again- ");
                userInput = sh.next().charAt(0);
                response = userInput;
            }
        }
      return response;//retuen the character inputted
  }//close 3rd method
  
}//close class