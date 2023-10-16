package DeitelJavaProgrammingBook.ChapterFive;

//5.12 (Integers Divisible by 3)

/*
Write an application that calculates the sum of those integers between
1 and 30 that are divisible by 3.
 */

public class IntegersDivisibleBy3 {
        public static void main(String[] args) {

            int sum = 0;

            for (int numbers = 1; numbers <= 30; numbers++) {

                if (numbers % 3 == 1) {

                    sum += numbers;
                }

            }
            System.out.println("The sum of integers between 1 and 30 that are divisible by 3" + sum);
        }

    }

