////////////////
//Russell Laros
//hw06-Root
//10-13-14
import java.util.Scanner;//import scanner
public class Root {//create class
    public static void main (String[] rootshit) {//create method
        Scanner sc = new Scanner(System.in);//create scanner
        double input;//create variable to be square rooted
        double x = 0;
        System.out.println("Enter a number greater than 0: ");//ask for input for number being squared
        if (! sc.hasNextDouble()) {//check if entered value is not a double
            System.out.println("Please enter a valid value");//print this
            return;//exit out
        }
        else {
            input = sc.nextDouble();//otherwise assign entered value to x
            if (input>0){
                x = input;
            }
            else {
                System.out.println("Please enter a valid value");
                return;
            }
        }
        double high = 1+x;//assign values to high
        double low = 0;//assign value to low
        double middle = (low + high) / 2;//assign value to middle
        while ((high - low) > 0.0000001) {//set conditions while high - low (which after 1 run will be equal to 0) is greater than a value to small run, so it will only run once
            if ((middle * middle) > x) {//if middle squared is greater than x, which is true for all real numbers
             high = middle;
             middle = (high + low) / 2;
                } 
            else {
             low = middle;
             middle = (high + low) / 2;
                }
        }//end of while
        System.out.println(high);//print value for high, which is now the square root
    }//end main method
}//end class