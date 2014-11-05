//Russell Laros
//hw09-CSE02
//Blocked AGain
//check for an int int the proper range(1-9) from the user
//then print the amount of numberstacks, but with one method for the blocks
//and one for the lines

import java.util.Scanner;//import scanner so we can accept input

public class BlockedAgain {//create class

    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }

    public static int getInt() {//create first method to take integer input from user
        Scanner scan = new Scanner(System.in);//create scanner called "scan"
        System.out.print("Enter an integer between 1 and 9 - ");//prompt for input
        String choice = scan.next();//create string to take what the user inputs
        boolean integerCheck = checkInt(choice);//create boolean to accept wether check for int is satisfied
        while (integerCheck == false) {//create while loop to keep asking for input if boolean is returned false(not an int)
            System.out.print("please enter an integer: ");
            choice = scan.next();//take inputed value
            integerCheck = checkInt(choice);//check again
        }
        double integer0 = Double.valueOf(choice);//make what was inputted into a double
        int intAct = (int) integer0;//then convert double into int
        boolean number = checkRange(intAct);//create boolean variable for wether the rang will be satisfied
        while (number == false) {//create while if input is still in improper length it will keep asking
            System.out.print("please enter an integer in the proper range(1-9): ");
            choice = scan.next();//reset variable to entered input
            integerCheck = checkInt(choice);//check again for int properties again. and if it is false ask for a proper int again
            if (integerCheck == false) {//if false again just send straight through and ask again
                number = false;
            }
            integer0 = Double.valueOf(choice);//re-assign values
            intAct = (int) integer0;
            if (integerCheck = true) {//if the int check is satidified check again if its in the proper range
                number = checkRange(intAct);//cehck range
            }
        }
        return intAct;//return the the number that made it through all the checks which should be an int between 1-9
    }//close the method

    public static boolean checkInt(String checkInt) {//check int method
        boolean check = true;//assign boolean as true
        try {//try to see if the string can be made into a double, which means is a number(s)
            double d = Double.valueOf(checkInt);//convert to double
            if (checkInt.matches("\\-?\\d+")) {//optional minus and at least one digit
                check = true;//if it can be made into a one digit double return the value true to let the getInt method that the number is g
            } else {
                check = true;//else its digits, which still satisfies that its an int so return that too
            }
        } catch (Exception e) {//otherwise the inout the inout was not numbers
            check = false;//so say that it is false, e.g. its not an int of any range
        }
        return check;//return the value for the check boolean(true/false)
    }//close the method

    public static boolean checkRange(int checkLength) {//check range method
        boolean check = true;//assign value to the boolean to check if its incorrect
        if (checkLength >= 1 && checkLength <= 9) {//if the int is in the proper range make the boolean is good to go
            check = true;
        } else {//else it doesnt satisfy so return that it doesnt(false)
            check = false;
        }
        return check;//return the assigned value for the check boolean
    }//close the method

    public static void allBlocks(int x) {//now to print the blocks
        block(x);//assign the verified and checked int to what will be printed out
    }//close the method

    public static void block(int y) {//mehtod to print out the blocks, make void because it doesnt need to return anything
        int i = 0, j = 0, k = 0, l = 0; //define all counter variables
        String dash = "-";//to make the dashes between blocks
        String center = "        ";//create spaces to center the numbers
        for (i = 1; i <= y; i++) {//print out inputted number of blocks
            System.out.print(center);//print the spaces to center the blocks
            for (j = 1; j < i; j++) {//print the height to be less than what the outer loop is at. the first run through this for loop wont perint anything, but the rest of the runs will. this accounts for the 1/3/5/7/etc. nature of the columns
                System.out.print(i + "" + i);
            }
            System.out.println(i);//print just one the first time through/then 1 the second + the extra two numbers/then three + plus the extra two
            line(i, j, k, l, center);//input current values of variable into the method for line placement
            System.out.println(center + dash);//print the center and dashes for that bottom row after each stack
            center = center.replaceFirst(" ", ""); //reduces the number of spaces ever time loop turns around 
            dash = dash.replaceFirst("-", "---");//same as spaces but for dashes intead

        }
    }//close the method

    public static void line(int i, int j, int k, int l, String spaces) {//method for lines

        for (k = 1; k < i; k++) {//counter will resume at current value of i for everytime the the block method runs through
            System.out.print(spaces);//print the spaces to center
            for (l = 1; l < i; l++) {//same as first loop
                System.out.print(i + "" + i);//wont print through first block but will for the rest giving it the 1/3/5/7/ etc look
            }
            System.out.println(i);//because wont print anything in inner loop the first time must print out a single one the first run through
        }//close the for
    }//close this method
}//close the class
