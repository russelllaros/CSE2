////////////
//Russell Laros
//CSE02-lab05-Enigma0
//debugging


/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String args []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
        switch(k+p+q+r){
            case 24: 
            case 25: System.out.println("sum is 25");
            default:
            System.out.println("To repeat, you entered "+n);
        }        
    }else{
      int n=4;
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
        switch(k+p+q+r){
            case 24: 
            case 25: System.out.println("sum is 25");
            default:
            System.out.println("To repeat, you entered "+n);
        }
    
    }
  }
}
/* Error report:
 *   Expand this comment:
 *   n was not initializing in the last print line because n was being set up inside the if statement. 
 *   So I put the entire switch inside the if or else so n was initialized correctly and then would be print out 
 *   correctly for the value entered and then read by the scanner.
 */
