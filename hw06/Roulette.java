/////////////////
//Russell Laros
//hw06-Roulette
//10-13-14
//This program generates 100 random rolls of a roulette wheel using the same randomly selcted number, then runs that simulation 1000 times and claculates the number of times
//the 100 rolls didn't win ANY money, how much money was won total, and how many of the 100 rolls did win money
public class Roulette { //create class

    public static void main(String prog[]) { //create main method
        int choice = (int) (Math.random() * 38);//create varibale for random number being betted on
        int i = 0; //set counter variable for while loop that runs 100 times
        int earnings = 0; //set variable that records total amount being earned
        int i2 = 0; //set counter for while loop that runs 1000 times
        int no = 0; //set counter for the amount of times a number does not match betted number
        int lose = 0; // set counter for the amount of times a person looses everyhting
        int match = 0;//set counter to count the number of times you have a match
        int nProfTimes = 0;//set counter that records how many times you you make a profit from a game of 100 rolls
        while (i2 < 1000) {//while loop for 1000 simulations fo 100 rolls
            while (i < 100) {//while loop of 100 rolls
                int number = (int) (Math.random() * 38);//make variable that is a random number between 0 and 37, or a roll on the roulette wheel
                if (choice == number) {//if the random number choosen and the roullette roll are the same
                    earnings += 35;//add 35 to earnings because you had to spend a dollar to get it
                    match++;//add one to the match count
                } else {//if numbers are not a match
                    no++;//add one to the no counter
                    earnings -= 1;//subtract one from earnings because you just lost a dollar
                }
                i++;//add one for one roll of roulette
                }
            i = 0;//reset counter so it can goo again
            if (no == 100) {//if you had no matches
                lose++;//add 1 to the lose everything counter
            }
            i2++;//add 1 to the 1000 loop counter
            if (match >= 3) {//if you had more than 3 matches you made a profit
                nProfTimes++;//so add 1 to the counter that counts number of times you made a profit
            }
            match = 0;//reset match counter so it can count again in the next 100 loop
        }
        int actEarn = earnings + 100000;//earnings is going to be your balance of how much you earned to spent, so to get total earnings you must add 100000, because you spent $100000 to roll 100000 times
        System.out.println("The number of times you lost everything " + lose);//print number of loses
        System.out.println("Your total earnings is $" + actEarn + ", but you spent $100000 to do this");//print total earnings
        System.out.println("The number of times you walked away with profit was " + nProfTimes);//print number of times you actually made a profit
    }//close the method
}//close the class
//really not sure if total earnings was suppossed to be the balance of money you have after playing or just your total winnings, because if its the balance you dont actually win any money
//you usually lose money
//if that was the case, take out "earnings -= 1;" in the inner while loop and print "earnings" instead of "actEarn" in the second print line.
//thanks, sorry the directions werent super clear