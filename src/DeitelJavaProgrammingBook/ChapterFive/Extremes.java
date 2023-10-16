package DeitelJavaProgrammingBook.ChapterFive;

//5.11 (Extremes)

/*
Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input
 */

import java.util.Scanner;

public class Extremes {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("How many numbers do you want to enter?");

            int userInput = input.nextInt();

            int[] saveResponse = new int[userInput];

            int minimumValue = 0;
            int maximumValue = 0;
            int extreme = minimumValue + maximumValue;

            int i;
            for (i = 0; i < userInput; i++) {
                System.out.println("Enter number: " + (i + 1));

                /**
                 * Issue Description: The value of (i + 1) is not being displayed as expected.
                 *
                 * Desired Output:
                 * Enter number 1:
                 * Enter number 2:
                 * Enter number 3:
                 */
            }

            if (i == 0) {
                minimumValue = saveResponse[i];
                maximumValue = saveResponse[i];

                if (saveResponse[i] < minimumValue)
                    minimumValue = saveResponse[i];

                /**
                 * Bug Description: The code logic initializes both `minimumValue` and `maximumValue`
                 * with the value at index 0 of the `saveResponse` array. However, the subsequent
                 * conditional check `if (saveResponse[i] < minimumValue)` is redundant, as
                 * `minimumValue` is already set to the same value.
                 */

                System.out.println("The minimum value is: " + minimumValue);
                System.out.println("The maximum value is: " + maximumValue);
                System.out.println("The sum of the extremes is: " + extreme);

            }
        }

    }

