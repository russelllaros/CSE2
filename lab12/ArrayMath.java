//Russell Laros
//CSE02-lab12
//11-28-14
//This program adds two arrays of the same length together and then adds two arrays of different lengths together
//then the program will compare arrays of the same length and display true or false if they are of the same length or not, respectivley

import java.util.Arrays;

public class ArrayMath {

    public static void main(String[] arg) throws Exception {
        double x[] = {2.3, 3, 4, -2.1, 82, 23},
                y[] = {2.3, 3, 4, -2.1, 82, 23},
                z[] = {2.3, 13, 14},
                w[] = {2.3, 13, 14, 12},
                v[],
                u[] = {2.3, 12, 14};
        v = addArrays(x, y);
        System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));
        System.out.println(display(x) + " \n  + " + display(z) + "\n   = "
                + display(addArrays(x, z)));
        System.out.println("It is " + equals(x, y) + " that " + display(x)
                + " == " + display(y));
        System.out.println("It is " + equals(z, w) + " that " + display(z)
                + " == " + display(w));
        System.out.println("It is " + equals(u, z) + " that " + display(u)
                + " == " + display(z));

    }

    public static String display(double[] x) {//this method displays the arrays
        String out = "{";
        for (int j = 0; j < x.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += x[j];
        }
        return out + "}";
    }

    public static boolean equals(double[] x, double[] y) {//this method checks if the arrays are equal
        boolean check = false;//create boolean to be returned
        if(Arrays.equals(x,y)){//if the arrays are equal
            check=true;//make the boolean to be returned true
        }
        return check;//return value for the boolean
    }

    public static double[] addArrays(double[] x, double[] y) {//this method adds up the arrays
        double[] sum = new double[x.length];
        if (x.length > y.length) {//if first array is greater in length than the second
            double[] temp = new double[x.length]; 
            for (int i = 0; i < y.length; i++) {//now set the sum of the sum array to the the sum of the y array
                temp[i] = y[i];
            }
            for (int i = (x.length - y.length); i < x.length; i++) {//run through the sum array from the difference of the two arrays
                temp[i] = 0;//set those spaces to 0 so when you add them 0 will be added
            }
            for (int i = 0; i < x.length; i++) {//now set the sum of the sum array to the the sum of the y array
                sum[i] = temp[i]+x[i];
            }

        }
        else{
            for(int i=0;i<x.length;i++){
                sum[i]=x[i]+y[i];
            }
        }
        return sum;//return the sum of the two
    }//close method
}//close class
