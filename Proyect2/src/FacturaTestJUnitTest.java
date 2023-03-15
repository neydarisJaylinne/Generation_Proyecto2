import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FacturaTestJUnitTest {


	@Test
	void testMain() {
		FacturaTest facturaTest = new FacturaTest();
		facturaTest.main(null);
		assertEquals("Total Factura = "+ facturaTest.sum, "Total Factura = " + facturaTest.sum);
	}

}
