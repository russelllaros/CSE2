////////////
//Russell Laros
//CSE02-lab06-Enigma0
//debugging
//10-1-14


/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String [] args){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n;
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   n was not initializing in the last print line because n was being stated inside the if statement. 
 *   So I set the variable n outside the if statements so it can initialize
 */
