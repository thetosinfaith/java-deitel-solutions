package DeitelJavaProgrammingBook.ChapterFive;

//5.13 (The Sum of a Series)

/*
Find the summation of the sequence of numbers 1, 2, 3 … n, where
n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
with the variable that accumulates the product?
 */

public class SumOfSeries {
    public static void main(String[] args) {

        long sequenceOfNumbers = 0;

        System.out.println("n");
        for (long n = 0; n < 101; n++) {
            System.out.println(n);

        }
        int n = 1;
        if (sequenceOfNumbers == n)
            for (int i = 0; i < n; i+=n) {
                System.out.println(sequenceOfNumbers);

            }
    }
}

