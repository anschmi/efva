package de.anschmidt.efva.createDestroyObjects.builder;

public class GroupTelescoping {
	
	int id;
	String name;
	
	public GroupTelescoping(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public GroupTelescoping(int id) {
		this(id, "");
	}
	
	public GroupTelescoping(String name) {
		this(0, name);
	}
	
}
