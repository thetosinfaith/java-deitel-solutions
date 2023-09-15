package DeitelJavaProgrammingBook.ChapterTwo;

/*
Write an application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference of the squares (first
number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
 */

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int firstInput = userInput.nextInt();

        System.out.print("Please enter the second number: ");
        int secondInput = userInput.nextInt();

        int squareFirstNumber = firstInput * firstInput;
        int squareSecondNumber = secondInput * secondInput;

        int sumOfSquare = squareFirstNumber + squareSecondNumber;
        int differenceOfSquares = squareFirstNumber - squareSecondNumber;

        System.out.println("The square of the first number is: " + squareFirstNumber);
        System.out.println("The square of the second number is: " + squareSecondNumber);
        System.out.println("The sum of their squares is: " + sumOfSquare);
        System.out.println("The difference of the squares is: " + differenceOfSquares);

    }
}
