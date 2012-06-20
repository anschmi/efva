package de.anschmidt.efva.createDestroyObjects.spi;

import static org.junit.Assert.*;

import org.junit.Test;

public class GroupSpiTest {

	@Test
	public void test() {
		Group group = GroupProvider.newGroup();
		assertTrue(group.getSize() == 5);
		assertEquals(group.getName(), "TestGroup");
	}

}
