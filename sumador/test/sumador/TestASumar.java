package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	public void testSuma() {
		ASumar sumi = new ASumar("123");
		String resultado = sumi.total();
		assertEquals("1 + 2 + 3 = 6",resultado);
	}

}
