import java.util.Scanner;

public class Test {
    
public static void main (String [] args) {
Scanner lol; //create new scanner
    lol = new Scanner( System.in ); //creating myScanner variable so new scanner now can accept input
    
    System.out.print("what do you call a guy in the ocean? ");
    String answer = lol.next().toUpperCase();
    int fudge;
    if("BOB".equals(answer)) {
        System.out.print("Atta girl\n");
        fudge = 1;
    } else {
        System.out.print("Try again...\n");
        fudge = 0;
        }
    if(fudge == 1) {
        System.out.print("What if he's standing on your porch? ");
        String answer2 = lol.next().toUpperCase();
        if("MATT".equals(answer2)) {
            System.out.print("Atta girl\n");
        } else {
        System.out.print("Try again...\n");
        }
    }
    
        
    }
}