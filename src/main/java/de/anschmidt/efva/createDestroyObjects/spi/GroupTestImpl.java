package de.anschmidt.efva.createDestroyObjects.spi;

public class GroupTestImpl implements Group {

	private static final String TEST_GROUP = "TestGroup";
	
	static {
		GroupProvider.registerGroup(GroupTestImpl.class);
	}

	public int getSize() {
		return 5;
	}

	public String getName() {
		return TEST_GROUP;
	}

}
