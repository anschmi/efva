package de.anschmidt.efva.createDestroyObjects.staticFactories;

/**
 * Use static factories where possible
 * 
 * @author andreas
 * 
 */
public class Elephant {

	String size = "";

	/**
	 * Make class not instantiable.
	 */
	private Elephant(String size) {
		this.size = size;
	}

	public static Elephant getSmallElephant() {
		return new Elephant("small");
	}

	public static Elephant getBigElephant() {
		return new Elephant("Big");
	}

}
