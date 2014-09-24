///////////////////////////
//Russell Laros
//Sep23,2014
//CSE02-hw04-IncomeTax
//This program prompts the user to enter an int that 
//is the thousands of dollars of income and then writes 
//out the amount of tax on the income, given the following 
//schedule:  <20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%

import java.util.Scanner;//Importing scanner

public class IncomeTax {//defining class
    public static void main(String[] args) { //main method required for java programs
    Scanner myScanner; //create new scanner
    myScanner = new Scanner( System.in ); //new scanner now can accept input
    
    System.out.print("Enter Income in thousands of dollars as an intger: $");//Prompt for income
    int income = myScanner.nextInt();//integer for income
    int netIncome = income * 1000;
    
    double tax1 = 0.05;//variable for tax on first condition
    double tax2 = 0.07;//variable for tax on second condition
    double tax3 = 0.12;//variable for tax on third condition
    double tax4 = 0.14;//variable for tax on fourth condition
    
    if (netIncome<20000) {//if statement for income under 20k
        double amountTax = netIncome * tax1;
        System.out.printf("your income is $"+netIncome+" and you your tax is 5%%, the amount you pay in taxes is $ %.2f \n", amountTax);
    } else if (netIncome>=20000 && netIncome<40000) {//if statement for income between 20k and 40
        double amountTax1 = netIncome*tax2;
        System.out.printf("\nyour income is $"+netIncome+" and you your tax is 7%%, the amount you pay in taxes is $ %.2f \n", amountTax1);
    } else if (netIncome>=40000 && netIncome<78000) {//if statement for income between 40 and 78
        double amountTax2 = netIncome*tax3;
        System.out.printf("\nyour income is $"+netIncome+" and you your tax is 12%%, the amount you pay in taxes is $ %.2f \n", amountTax2);
    } else if (netIncome>=78000) {//if statement for income over 78
        double amountTax3 = netIncome*tax4;
        System.out.printf("\nyour income is $"+netIncome+" and you your tax is 14%%, the amount you pay in taxes is $ %.2f \n", amountTax3);
    } else {
        System.out.print("Error");
    
    }
    }
}