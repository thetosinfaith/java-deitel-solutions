package DeitelJavaProgrammingBook.ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class PetrolPurchaseTest {
    @Test
    void testThatAmountCalculatesTheNetPurchaseAmount(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("Total Filling Station", "Diesel",
                50, 1.600, 0.01);

        int expected = (int) (50 * 1.600 * 0.01);
        int actual = petrolPurchase.getQuantityOfPurchaseInLitres();

        }

    }
