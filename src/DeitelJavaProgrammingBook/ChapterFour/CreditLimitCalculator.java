package DeitelJavaProgrammingBook.ChapterFour;

/*
(Credit Limit Calculator)

Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account. For each customer, the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit

The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
 */

import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        System.out.println("Credit Limit Calculator");
        System.out.println("Customer Information");
        Scanner CustomerInformation = new Scanner(System.in);

        System.out.println("Could you please share your account number? This will help us find your information: ");
        int accountNumber = CustomerInformation.nextInt();

        System.out.println("Do you remember how much money you had in your account at the beginning of the month?: ");
        int balance = CustomerInformation.nextInt();

        System.out.println("How much have you spent this month on your credit card? This includes all your charges and purchases: ");
        int charges = CustomerInformation.nextInt();

        System.out.println("Have you received any money back or credits on your account this month? If so, how much? ");
        int totalCredits = CustomerInformation.nextInt();

        System.out.println("What's your allowed credit limit: ");
        int creditLimit = CustomerInformation.nextInt();

        int newBalance = (balance + charges - totalCredits);

        if (newBalance > creditLimit)
            System.out.println("Credit Limit Exceeded!");

        else
            System.out.println("Your Current Balance is: " + newBalance);

    }
}
