package DeitelJavaProgrammingBook.ChapterFour;

/*
4.20 (Tax Calculator) Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen, then determine and display
the citizen’s total tax. Use class Scanner to input the data
 */

//prompt user for the following
//
//        citizens name
//        earing in a year
//
//        tax rate = 15
//        earning
//        earning on excess = 20
//
//        display citizen total task

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        int taxRate = 15;

        Scanner citizenName = new Scanner(System.in);

        System.out.print("Enter Citizen Name: ");
        String name = citizenName.nextLine();

        System.out.print("What's your earning in a year: $");
        int earning = citizenName.nextInt();

        int totalTax = earning / taxRate;

        System.out.print("Your citizen total tax is $" + totalTax);


    }
}
