package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Fecha fechas = new Fecha();
	
	@Test
	void CP1() {
		assertFalse(Fecha.validarFecha(2010, 10, -1));
	}


	@Test
	void CP2() {
		assertFalse(Fecha.validarFecha(2010, -1, 1));
	}


	@Test
	void CP3() {
		assertTrue(Fecha.validarFecha(2003, 8, 22));
	}


	@Test
	void CP4() {
		assertTrue(Fecha.validarFecha(2003, 9, 22));
	}

}
