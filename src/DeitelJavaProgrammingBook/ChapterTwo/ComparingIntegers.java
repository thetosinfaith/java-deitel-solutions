package DeitelJavaProgrammingBook.ChapterTwo;

/*

2.16

Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. Use the techniques shown in Fig. 2.15.
 */

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter one integer: ");
        int response = userInput.nextInt();

        int square = response * response;

        if (square > 100) {
            System.out.println(response + " and its square are greater than 100");
        } else if (square == 100)
            System.out.println(response + " and its square are equal to 100");
        else if (square < 100) {
            System.out.println(response + " and its square are less than 100");
        } else {
            System.out.println("Invalid");
        }

    }

}

