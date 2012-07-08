package de.anschmidt.efva.createDestroyObjects.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import de.anschmidt.efva.createDestroyObjects.builder.GroupBean;

public class GroupBeanTest {

	@Test
	public void test() {
		GroupBuilder bean = new GroupBuilder.Builder(15).setName("test").build();
	}

}
