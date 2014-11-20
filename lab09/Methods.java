//Russell Laros
//lab09
//CSE02
//MethodCalls
import java.util.Scanner;//import scanner so we can accept input

public class Methods {//define class

    public static void main(String[] arg) {//create method main
        Scanner scan = new Scanner(System.in);//create new scanner
        int a, b, c;//create new variabel to be the user inputs
        System.out.println("Enter three ints");//prompt user
        a = getInt(scan);//put first input through checks for int
        b = getInt(scan);//put second input through checks for int
        c = getInt(scan);//put third input through checks for int
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));//print
        System.out.println("The larger of " + a + ", " + b + ", and " + c//print
                + " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b
                + ", and " + c + " are in ascending order");//print
    }//clsoe main method

    public static int getInt(Scanner scan) {//create method to check for proper int
        int b = 0;//create new int to be inputted
        System.out.print("Enter an int-");//ask for an int
        while (!scan.hasNextInt()) {//while input is not an int keep running loop
            System.out.print("You did not enter an int; try again-");//ask for an int
            scan.next();//go next
        }
        b = scan.nextInt();//define variable as the inputted value
        return b;//return int value of b
    }//close method getInt

    public static int larger(int a, int b) {//create method to check which of the first two ints entered is larger
        int c = 0;//create variabel to be returned
        if (a > b) {//if a is greater than be a will be returned
            c = a;
        } else {//else b will be returned
            c = b;
        }
        return c;//return whichever variable was bigger
    }//close method larger

    public static boolean ascending(int a, int b, int c) {//create method to check if ints are in ascending order
        boolean check = false;//create boolean to be returned
        if (a < b && b < c) {//if a is the smallest, b is in the middle, and c is the largest
            check = true;//boolean is true, which means that they are ascending
        }
        return check;//return value for the boolean
    }//close method ascending

}//close class
