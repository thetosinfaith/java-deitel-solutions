package DeitelJavaProgrammingBook.ChapterSix;

import java.util.Scanner;

public class ParkingCharges {

    public int calculateCharges(int hoursParked) {
        int pricePerHour = 100;
        int additionalCharge = 50;
        int newPrice = pricePerHour * hoursParked;

        if(hoursParked > 3){
            int extraHours = hoursParked - 3;
            int normalHours = hoursParked - extraHours;
            int extraCharges = additionalCharge * extraHours;
            newPrice =  (pricePerHour * normalHours) + extraCharges;
        }
        return newPrice;
    }


}
