//Russell Laros
//lab11
//CSE02
//Arrays

import java.util.Scanner;//import scanner so we can take input

public class Arrays {//create class arrays

    public static void main(String[] args) {//create main method
        int arrayOne[] = new int[10];//create first array
        Scanner scanMe = new Scanner(System.in);//create scanner
        System.out.println("Enter an 10 Ints: ");//prompt for 10 ints
        for (int i = 0; i < 10; i++) {//for loop totake ten ints from the user
            arrayOne[i] = scanMe.nextInt();//input value to certain spot in the array(0-9)
        }
        int min = arrayOne[0];//create varibale to take minimum value
        for (int i = 1; i < arrayOne.length; i++) {//run through all values of array one
            if (min > arrayOne[i]) {//if the value at the first spot of array one is less than whatever value we are at int eh array
                min = arrayOne[i];//then reset the value of min to the value we are at
            }
        }
        System.out.println("The lowest entry is: " + min);//print out the lowest value
        int max = arrayOne[0];//create value for max value
        for (int i = 1; i < arrayOne.length; i++) {//run through the array
            if (arrayOne[i] > max) {//if the value of max is less than whatever value we are at in the array
                max = arrayOne[i];//then reset the value of max to whatever value we are at in teh array
            }
        }
        System.out.println("The largest entry is: " + max);//print max
        int sum = 0;//
        for (int i : arrayOne) {
            sum += i;
        }
        System.out.println("The sum fo the array is: " + sum);//print sum
        int arrayTwo[] = new int[arrayOne.length];//create a second array
        for (int i = 0; i < arrayOne.length; i++) {//run through the second array
            arrayTwo[i] = arrayOne[arrayOne.length - 1 - i];//set array two's value at the given place to be equal to the 
            //value of array one at its length minus 1 minus the current value for the counter in the loop
        }
        for(int i=0;i<arrayOne.length;i++){//now print out the two arrays side by side
            System.out.println(" "+arrayOne[i]+"  "+arrayTwo[i]);//print the values for both at slots 0-9 with spaces in between
        }
    }

}
