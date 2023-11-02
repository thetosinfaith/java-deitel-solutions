package DeitelJavaProgrammingBook.ChapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {

    @Test
    void testThatApplicationCanDisplayParkingChargesIfWithinThreeHours(){
        ParkingCharges input = new ParkingCharges();
        int hoursParked = 3;
        assertEquals(300, input.calculateCharges(hoursParked));
    }
    @Test
    void testThatApplicationCanDisplayParkingChargesIfMoreThanThreeHours(){
        ParkingCharges input = new ParkingCharges();
        int hoursPacked = 7;
        assertEquals(500, input.calculateCharges(hoursPacked));
    }

}