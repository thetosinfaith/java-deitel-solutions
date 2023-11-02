package DeitelJavaProgrammingBook.ChapterSix;

import java.util.Scanner;

public class ParkingChargesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingCharges object = new ParkingCharges();

        System.out.println("How many hours did you park?");
        int numberOfHoursParked = scanner.nextInt();

        int charges = object.calculateCharges(numberOfHoursParked);

        System.out.println("For "+numberOfHoursParked+" hours, the amount to pay is N"+charges);
    }
}
