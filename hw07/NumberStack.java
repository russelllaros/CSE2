import java.util.Scanner;//import scanner

public class NumberStack {//create class

    public static void main(String[] args) {//create new method
        Scanner scan = new Scanner(System.in);//create scanner called "scan"
        System.out.print("Enter an integer between 1 and 9 - ");//prompt for input
        int choice = 0;//define variable fot the choice
        if (scan.hasNextInt()) {//if the entered character was an integer
            choice = scan.nextInt();//assign variable to choice
        } else {//else
            System.out.println("Improper input, try again");//print that it's incorrect
            return;//quit out
        }

        if (choice >= 1 && choice <= 9) {//if user input is between 1 and 9 do everyhting in the if statement
            int i, j, k, l; //define all counter variables
            String dash = "-";//to make the dashes
            String center = "        ";//create spaces to center the code
            System.out.println("For Loop:");//print that this is the for loops
            for (i = 1; i <= choice; i++) {//this loop will controls the number of blocks(if choice = 3, there will be 3 blocks, if 4 there will be 4, etc.)
                System.out.print(center);//centers the characters to be printed
                for (j = 1; j < i; j++) {//Rows: the first run through this for won't run, but the second it will print two counters plus the other singular print under this
                    System.out.print(i + "" + i);//print the two variables
                }
                System.out.println(i);//will print out a single count everytime adding to the other counts being printed to give the 1/3/5/7/9..etc structure of the blocks
                for (k = 1; k < i; k++) {//Columns: this l
                    System.out.print(center);//this space centers the code
                    for (l = 1; l < i; l++) {//this loop contorls the 
                        System.out.print(i + "" + i);
                    }
                    System.out.println(i);
                }
                System.out.println(center + dash);
                center = center.replaceFirst(" ", ""); //reduces the number of spaces ever time loop turns around 
                dash = dash.replaceFirst("-", "---");
            }
            System.out.println("While Loop:");
            i = 1;//re-initializing the variables so the counters start back at one
            j = 1;
            k = 1;
            l = 1;
            dash = "-";//reinitialize the dashes
            center = "        ";//reinitialize the spaces
            while (i <= choice) {//this loop will controls the number of blocks(if choice = 3, there will be 3 blocks, if 4 there will be 4, etc.)
                System.out.print(center);//centers the characters to be printed
                j = 1;
                k = 1;
                while (j < i) {//the first run through this for won't run, but the second it will print two counters
                    System.out.print(i + "" + i);
                    j++;
                }
                System.out.println(i);//will print this out single count everytime
                while (k < i) {//this loop controls the number of rows
                    System.out.print(center);//this center the 
                    l = 1;
                    while (l < i) {
                        System.out.print(i + "" + i);
                        l++;
                    }
                    System.out.println(i);
                    k++;
                }
                System.out.println(center + dash);
                center = center.replaceFirst(" ", ""); //reduces the number of spaces ever time loop turns around 
                dash = dash.replaceFirst("-", "---");
                i++;
            }
            System.out.println("Do While Loop:");
            i = 1;//must re-initialize variables
            j = 1;
            k = 1;
            l = 1;
            dash = "-";//re-initialize the dashes
            center = "        ";//re-initialize the spacing so its back at one
            do {//this loop will controls the number of blocks(if choice = 3, there will be 3 blocks, if 4 there will be 4, etc.)
                System.out.print(center);//centers the characters to be printed
                j = 1;//must re-initialize to counter every run through the loop
                do {//the first run through this for won't run, but the second it will print two counters
                    if (j < i) {//had to put in an if statement otherwise it would print out to many numbers on the first block of 1s
                        System.out.print(i + "" + i);//print an extra two for every new line in a block
                        j++;//++ so the counter compiles
                    }
                } while (j < i);
                System.out.println(i);//will print this out single count everytime plus the extra double printed counts
                k = 1;//have to reset counter so it runs back through the loop
                if (k < i) {
                    do {//this loop controls the number of rows
                        System.out.print(center);//this center the numbers
                        l = 1;//reset the counter
                        if (l < i) {//made an if so it checks fot the condition and doesnt just run through the first time. otherwise there will be to many 1s int eh first block
                            do {
                                System.out.print(i + "" + i);//printing an extra two numbers so the blocks will have the 1/3/5/7/etc.. structure
                                l++;//adding to the counter
                            } while (l < i);
                            System.out.println(i);
                            k++;//adding to the counter
                        }
                    } while (k < i);//condition
                }
                System.out.println(center + dash);//creates the bottom most row of dashes with the spaces
                center = center.replaceFirst(" ", ""); //reduces the number of spaces ever time loop turns around 
                dash = dash.replaceFirst("-", "---");
                i++;
            } while (i <= choice);//condition

        } else {//else choice isnt between 1 and 9 error statement
            System.out.println("Improper input, try again");//print that its incorrect
            return;//quit out
        }
    }//close main method
}//close class