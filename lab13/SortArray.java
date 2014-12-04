//Russell Laros
//CSE2-lab13
//11-28-14
//This program sorts two a dimensional array of random numbers between 0 and 39

public class SortArray {

    public static void main(String[] args) {
        int[][] a = new int[5][]; //create new array "a"
        for (int i = 0; i < a.length; i++) {//work through the array rows making the number columns based on what which row
            a[i] = new int[(i * 3) + 5];
        }
        sort(generate(a));//call generate, which makes all the random numbers and inputs them into the array
    }                     //then puts generate into sort which will sort the array

    public static int[][] generate(int[][] a) {
        System.out.println("The array before sorting:");//print
        for (int i = 0; i < a.length; i++) { //works though rows of the array
            for (int j = 0; j < a[i].length; j++) { //works though columns of the array
                a[i][j] = (int) (Math.random() * 40); //inputs a random number from 0-39 in each spot
                System.out.print(a[i][j] + " "); //print that number at that position, plus a space so we can distinguish between numbers
            }
            System.out.println(); //move down a line
        }
        System.out.println();//look pretty
        return a;//return the generated array of random numbers between 0-39
    }

    public static void sort(int[][] a) {
        System.out.println("The array after sorting:");//print
        for (int i = 0; i < a.length; i++) {//work through rows of the array
            for (int j = 0; j < a[i].length; j++) {//work through columns
                int num = a[i][j];//create a min value that is whatever value is at this position
                int check = j;

                for (int k = j + 1; k < a[i].length; k++) {//
                    if (num > a[i][k]) { // if the earlier taken value is less than this value
                        num = a[i][k]; //take whatever value is at this position and make it the new num
                        check = k;//make check equal to k 
                    }
                }
                if (check != i) { //if there is a difference in the numbers
                    a[i][check] = a[i][j];//swap
                    a[i][j] = num;//swap
                }
                System.out.print(a[i][j] + " "); //print the sorted value in new position plus a space to make it look pretty
            }
            System.out.println(); //look pretty
        }//close FOR for the rows
    }//close method

}//close class
//Chloe Stein is hawt
//lol
