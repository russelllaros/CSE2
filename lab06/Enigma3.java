/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */
import java.util.Scanner;

public class Enigma3 {

    public static void main(String[] arg) {
        int n = 40, k = 60;
        int out = 0;
        switch (k % 14) {
            case 12:
            case 13:
                out += 13;
                break;
            default:
                out += 40;
                n /= 3;
                k -= 7;
        }
        //System.out.println(n);
        //System.out.println(k);
        if (n * k % 12 < 12) {
            n -= 20;
            out += n;
        }
        if (n * n > k) {
            n = 42;
            out += n + k;
        } else {
            n = 45;
            out += n + k;
        }
        //System.out.println(n);
        //System.out.println(k);
        switch (n + k) {
            case 114:
                n -= 11;
                k -= 3;
                //System.out.println(n);
                //System.out.println(k);
                break;
            case 97:
                n -= 14;
                k -= 2;
                //System.out.println(n);
                //System.out.println(k);
                break;
            case 98:
                n /= 5;
                k /= 9;
            //System.out.println(n);
            //System.out.println(k);
            default://<---- Happens in this default of the switch
                n -= 3;
                k -= 5;//<---- becomes zero here
                System.out.println(n);
                System.out.println(k);
        }
        //System.out.println(n);
        //System.out.println(k);
        out += 1 / n; //+ 1/k;<----This k will be zero
        System.out.println(out);
    }
}

/*
 * Error report:
 * The final value for k was zero and it was dividing one. You cant divide something by zero
 * So I added print line in every spot where n and k were having their values change then narrowed it down
 * by commenting out the print lines that werent outputting zero for k
 * 
 * 
 * 
 */
