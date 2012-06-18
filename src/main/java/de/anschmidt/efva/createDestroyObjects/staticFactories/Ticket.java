package de.anschmidt.efva.createDestroyObjects.staticFactories;

public class Ticket {

	int price;

	public static Ticket getNewBillet() {
		return new HalbTaxBillet();
	}
}
