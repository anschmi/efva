package de.anschmidt.efva.createDestroyObjects.spi;

import java.util.LinkedList;
import java.util.List;

public class GroupProvider {
	
	static List<Class<? extends Group>> groups = new LinkedList<Class<? extends Group>>();
	
	static {
		try {
			Class.forName("de.anschmidt.efva.createDestroyObjects.spi.GroupTestImpl");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void registerGroup(Class<? extends Group> group){
		groups.add(group);
	}
	
	public static Group newGroup() {
		try {
			return groups.iterator().next().newInstance();
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

}
