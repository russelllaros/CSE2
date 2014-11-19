//Russell Laros
//CSE02-hw10
//this program finds if there are any duplicants in an array of 10 
//inputted digits and then also finds if there is exactly one duplicant
//11/12/14
import java.util.Scanner;

public class FindDuplicates {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";
            } else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";
            } else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }

    private static boolean hasDups(int[] num) {
        boolean check = false;
        for (int j = 0; j < num.length; j++) {
            for (int k = j + 1; k < num.length; k++) {
                if (k != j && num[k] == num[j]) {
                    check = true;
                }
            }
        }
        return check;
    }

    private static boolean exactlyOneDup(int[] num) {
        boolean check = false;
        int l = 0;
        for (int j = 0; j < num.length; j++) {
            for (int k = j + 1; k < num.length; k++) {
                if (k != j && num[k] == num[j]) {
                    l++;
                }
            }
        }
        if (l == 1) {
            check = true;
        }
        return check;
    }
}
