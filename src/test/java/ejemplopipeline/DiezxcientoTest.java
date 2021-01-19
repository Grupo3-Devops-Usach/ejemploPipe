package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
		assertEquals(2300000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
<<<<<<< HEAD
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
=======

	Diezxciento diezxciento = new Diezxciento(23000000,900000);
>>>>>>> f78cc7411b14df6c6e9458a83f2107f53c642b31
		assertEquals(0, diezxciento.impuesto());
	}

	@Test
	public void testSaldoAhorro() throws Exception {
<<<<<<< HEAD
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
		assertEquals(20700000, diezxciento.saldoAhorro());
=======
		Diezxciento diezxciento = new Diezxciento(2070000,900000);
		assertEquals(0, diezxciento.saldoAhorro());

>>>>>>> f78cc7411b14df6c6e9458a83f2107f53c642b31
	}

}
