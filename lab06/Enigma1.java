///////////
//Russell Laros
//CSE02-lab06-Enigma1
//debugging
//10-1-14
import java.util.Scanner;
public class Enigma1{
  public static void main(String []args ){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
    System.out.println("You entered "+x+"%");
    //print out the proportion remaining for select percentages
    double n;
    if((100-x)/100>=0) { //when the user enters 7
      n = (100-x)/100;
      System.out.println("The proportion remaining is "+n);
    } else {
      System.out.println("You entered in an improper value");  
       }  
  }

}
/* Error report: 
 *  Ok, the way the if statement determined the proportion from the entered input was
 *  flat out incorrect. So I fixed that. Then I created the variable n, which was the 
 *  remaining proportion, found my subtrating the entered proportion from 100
 *  This programs arithmetic was just not right
 * 
 * 
 */
