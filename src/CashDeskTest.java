import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CashDeskTest {
	
	CashDesk kasse = new CashDesk();


	@Test
	void testAddTax() {

	assertEquals(kasse.addTax(1) , 1.19);
	Assertions.assertThrows(IllegalArgumentException.class, () ->{kasse.addTax(-2);});
	}
	
	@Test
	void testRemoveDiscount() {
		
		assertEquals(kasse.removeDiscount(0.2,2),1.6);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{kasse.removeDiscount(1.1,2);});

		Assertions.assertThrows(IllegalArgumentException.class, () ->{kasse.removeDiscount(0.2,-2);});

		Assertions.assertThrows(IllegalArgumentException.class, () ->{kasse.removeDiscount(-0.2,2);});

	}

}
