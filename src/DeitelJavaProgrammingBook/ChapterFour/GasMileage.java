package DeitelJavaProgrammingBook.ChapterFour;

/*
4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user.
 */

import java.util.Scanner;

public class GasMileage {
        public static void main(String[] args) {
            Scanner driversInput = new Scanner(System.in);

            System.out.print("Enter the miles driven for this trip: ");
            int milesDriven = driversInput.nextInt();

            System.out.print("Enter the number of gallons used for this trip: ");
            int gallonUsed = driversInput.nextInt();

            int totalMileage = milesDriven / gallonUsed;
            System.out.println("Your car's mileage is " + totalMileage + " kilometres per litre");

            System.out.print("Do you want to record more trips? Please, enter yes or no: ");
            String record = driversInput.nextLine();

            boolean yes = true;
            boolean no = false;

            while (true) {

                System.out.print("Enter the miles driven for this trip: ");
                int milesDriven1 = driversInput.nextInt();

                System.out.print("Enter the number of gallons used for this trip: ");
                int gallonUsed1 = driversInput.nextInt();

                int totalMileage1 = milesDriven / gallonUsed;
                System.out.println("Your car's mileage is " + totalMileage1 + " kilometres per litre");

                if (driversInput.equals("exit"))

                    break;
            }

        }
}

