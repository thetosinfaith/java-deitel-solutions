package DeitelJavaProgrammingBook.ChapterTwo;

/*
Write statements to accomplish each of the following tasks:
a) Declare variables c, thisIsAVariable, q76354 and number to be of type int and initialize
each to 0.
b) Prompt the user to enter an integer.
c) Input an integer and assign the result to int variable value. Assume Scanner variable
input can be used to read a value from the keyboard.
d) Print "This is a Java program" on one line in the command window. Use method
System.out.println.
e) Print "This is a Java program" on two lines in the command window. The first line
should end with Java. Use method System.out.printf and two %s format specifiers.
f) If the variable number is not equal to 7, display "The variable number is not equal to 7".
 */

import java.util.Scanner;

public class IntegerOperations {
        public static void main(String[] args) {

            int c = 0;
            int thisIsAVariable = 0;
            int q76354 = 0;
            int number = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter an Integer: ");
            int input = scanner.nextInt();

            System.out.printf("%s\n%s\n", "This is a Java", "program");

            if (number != 7 )

                System.out.println("The variable number is not equal to 7");


        }

    }

