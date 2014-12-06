//Russell laros
//cse2
//hw11
//Matrix Sorting program
//12-5-14
//This program genrates a 3d array and implements a random number from
//0-99 in every array slot
//it should then find the smallest value
//then sort it from smallest to largest

public class MatrixSorter {

    public static void main(String arg[]) {
        int mat3d[][][];//create the matrix
        mat3d = buildMat3d();//assign value of mat3d to what is going to be generated
        show(mat3d);//use show method to show it
        System.out.println("The smallest entry in the 3D matrix is "
                + findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }

    public static int[][][] buildMat3d() {//generating the random numbers
        int[][][] mat3d = new int[3][7][11];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 + 2 * i; j++) {
                for (int k = 0; k < i + j + 1; k++) {
                    mat3d[i][j][k] = (int) (Math.random() * 99);//generates random number from 0-99 and puts it in the correspnidng spot in the array
                }
            }
        }

        return mat3d;
    }

    public static void show(int[][][] mat3d) {//show prints out the array inputted
        for (int i = 0; i < 3; i++) {
            System.out.println("---------------- slab " + (i + 1));//prints which slab it is currently
            for (int j = 0; j < 3 + 2 * i; j++) {
                for (int k = 0; k < i + j + 1; k++) {
                    System.out.print(mat3d[i][j][k] + " ");//prints out which number is in there
                }
                System.out.println();
            }
        }
        System.out.println("----------------");//to look pretty
    }

    public static int findMin(int[][][] mat3d) {//find min
        int check = mat3d[0][0][0];//create a min vlaue that is the first number in the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 + 2 * i; j++) {//work through every value of the array
                for (int k = 0; k < i + j + 1; k++) {
                    if (mat3d[i][j][k] < check) {
                        check = mat3d[i][j][k];//if the current value youre at in the array is smaller than the value at the first position change it out, and so on and so forth
                    }
                }
                System.out.println();
            }
        }
        return check;
    }

    public static void sort(int[][] array) {
        //sorry
        //hope we can still be friends
    }
}//love