package de.anschmidt.efva.createDestroyObjects.staticFactories;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransportTest {

	/**
	 * Sample for immutable objects 
	 * 
	 */
	@Test
	public void test() {
		//as Enum
		Enum<Transport> transport = Transport.valueOf(Transport.class, "BUS"); 
		assertEquals(Transport.BUS, transport);
		
		//as object
		Ticket ticket = Ticket.getNewBillet();
		assertEquals(HalbTaxBillet.class, ticket.getClass());
	}

}
