package de.anschmidt.efva.createDestroyObjects.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import de.anschmidt.efva.createDestroyObjects.builder.GroupBean;

public class GroupBuilderTest {

	@Test
	public void test() {
		GroupBean bean = new GroupBean();
		bean.setId(15);
		bean.setName("test");
		
	}

}
