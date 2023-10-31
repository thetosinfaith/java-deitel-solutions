package DeitelJavaProgrammingBook.ChapterFour.MakingADifference;
/*
Making a Difference

4.39 (Enforcing Privacy with Cryptography)

A company that wants to send data over the Internet has asked you to write a program that will encrypt it
so that it may be transmitted more securely. All the data is transmitted as four-digit integers. Your application
should read a four-digit integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer
 */
import java.util.Scanner;

public class PrivacywithCryptography1 {

    public static void main(String[] args) {
        int add = 7;
        int divide = 10;
        Scanner userInput = new Scanner(System.in);

        for (int input = 0; input < 4; input++) {
            System.out.println("Enter digit: ");
            int response = userInput.nextInt();

        }








    }
}
