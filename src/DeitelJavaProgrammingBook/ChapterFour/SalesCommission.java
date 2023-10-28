package DeitelJavaProgrammingBook.ChapterFour;

/*
(Sales Commission Calculator)

A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are shown in Fig. 4.33.

Develop a Java application that inputs one salesperson’s items
sold for last week and calculates and displays that salesperson’s earnings.
There’s no limit to the number of items that can be sold
 */

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        System.out.println("Please input the list of items sold by each salesperson: ");

        Scanner salesPerson = new Scanner(System.in);
        boolean item = true;

        while (item) {
            System.out.println("Please enter number of the item:");
            int itemNumber = salesPerson.nextInt();

            System.out.println("What's the price of the item:");
            int value = salesPerson.nextInt();

            System.out.print("Do you want to enter more data? (yes/no): ");
            String response = salesPerson.nextLine();

            if (response.equals("no")) {
                item = false;
            }
        }
    }

}
