package DeitelJavaProgrammingBook.ChapterTwo;

/*
(World Population Growth Calculator) Search the Internet to determine the current world
population and the annual world population growth rate. Write an application that inputs these values,
then displays the estimated world population after one, two, three, four and five years.
 */

import java.util.Scanner;

public class WorldPopulationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Current World Population: ");
        System.out.println("Annual Growth Rate: ");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }

}
