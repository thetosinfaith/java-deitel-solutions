package DeitelJavaProgrammingBook.ChapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbers1Test {

    @Test

    void testCanRoundValuesToTheNearestInteger(){

        RoundingNumbers1 calculate = new RoundingNumbers1();

        double x = 0;
        double y = Math.floor(x + 0.5);

        assertEquals(0, 3);

    }
}