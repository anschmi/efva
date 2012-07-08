package de.anschmidt.efva.createDestroyObjects.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import de.anschmidt.efva.createDestroyObjects.builder.GroupTelescoping;

public class GroupTelescopingTest {

	@Test
	public void test() {
		GroupTelescoping teleconst = new GroupTelescoping(15);
		teleconst = new GroupTelescoping("test");
		teleconst = new GroupTelescoping(15, "test");
	}

}
