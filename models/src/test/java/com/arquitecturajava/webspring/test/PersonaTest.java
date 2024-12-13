package com.arquitecturajava.webspring.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.webspring.models.Persona;

class PersonaTest {

	@Test
	void MayorEdadTest1() {
		Persona p = new Persona("Pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}

	@Test
	void MayorEdadTest2() {
		Persona p = new Persona("Pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void MayorEdadTest3() {
		Persona p = new Persona("Pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void MayorEdadTest4() {
		Persona p = new Persona("Pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
}
