import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaCapicuaTest {

	
	@Test
	void testFecha11022011() {
		String numero="11/02/2011";
		boolean esperado= true;
		boolean resultado= FechaCapicua.esCapicua(numero);
		assertEquals(esperado,resultado);
	}
	
	@Test
	void testFecha26071988() {
		String numero="26/07/1988";
		boolean esperado= false;
		boolean resultado= FechaCapicua.esCapicua(numero);
		assertEquals(esperado,resultado);
	}
	
	@Test
	void testFecha11122111() {
		String numero="11/12/2111";
		boolean esperado= true;
		boolean resultado= FechaCapicua.esCapicua(numero);
		assertEquals(esperado,resultado);
	}
	
	@Test
	void testFecha05121986() {
		String numero="05/12/1986";
		boolean esperado= false;
		boolean resultado= FechaCapicua.esCapicua(numero);
		assertEquals(esperado,resultado);
	}
}
