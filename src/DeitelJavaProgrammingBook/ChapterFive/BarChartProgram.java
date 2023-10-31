package DeitelJavaProgrammingBook.ChapterFive;

import java.util.Scanner;

public class BarChartProgram {

    private static int response(String s) {
        return response("*");
    }

    public static void main(String[] args) {

        Scanner program = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int response = program.nextInt();


            for (int eachNumber = 0; eachNumber < response; eachNumber++) {
                response = program.nextInt();
                System.out.println(response("*"));


            }

        }

    }

}




