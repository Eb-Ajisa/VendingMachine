import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VendingMachineTest {

    public VendingMachine vendingMachine;

    @BeforeEach 
    void setUp() {
        vendingMachine = new VendingMachine();
    }


    @AfterEach 
    void tearDown() {
        vendingMachine = null;
    }



    @Test
    void testAddItem(){
        vendingMachine.addItem("chips", "A");

        assertEquals("chips", vendingMachine.getItem("A"));




    }

    @Test
    void testGetBalance() {

    }

    @Test
    void testGetItem() {

    }

    @Test
    void testInsertMoney() {

    }

    @Test
    void testMakePurchase() {

    }

    @Test
    void testRemoveItem() {

    }

    @Test
    void testReturnChange() {

    }
}
