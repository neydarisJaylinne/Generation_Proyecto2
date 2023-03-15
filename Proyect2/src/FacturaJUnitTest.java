import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacturaJUnitTest {

	@Test
	void testGetNumero() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
		String total = factura.getNumero();
		assertEquals("1", total);
	}

	@Test
	void testSetNumero() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
        factura.setNumero("1");
        assertTrue(factura.getNumero() == "1");
	}

	@Test
	void testGetDescripcion() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
		String total = factura.getDescripcion();
		assertEquals("AAAA", total);
	}

	@Test
	void testSetDescripcion() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
        factura.setDescripcion("AAAA");
        assertTrue(factura.getDescripcion() == "AAAA");
	}

	@Test
	void testGetCantComprada() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
		int total = factura.getCantComprada();
		assertEquals(2, total);
	}

	@Test
	void testSetCantComprada() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
        factura.setCantComprada(3);
        assertTrue(factura.getCantComprada() == 3);
	}

	@Test
	void testGetPrecioArticulo() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
		double total = factura.getPrecioArticulo();
		assertEquals(1.0, total);
	}

	@Test
	void testSetPrecioArticulo() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
        factura.setPrecioArticulo(1.1);
        assertTrue(factura.getPrecioArticulo() == 1.1);
	}
	
	@Test
	void testGetTotalFactura() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
		double total = factura.getTotalFactura(1.1);
		assertEquals(1.1, total);
	}

	@Test
	void testGetTotalFacturaCero() {
		Factura factura = new Factura("1", "AAAA", 2, 1.0);
		double total = factura.getTotalFactura(-1);
		assertEquals(0, total);
	}
	
	

}
