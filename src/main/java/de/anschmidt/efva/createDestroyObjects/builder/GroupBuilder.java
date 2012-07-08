package de.anschmidt.efva.createDestroyObjects.builder;

public class GroupBuilder {
	
	int id;
	String name;
	
	private GroupBuilder(Builder builder) {
		super();
		this.id = builder.id;
		this.name = builder.name;
	}

	public static class Builder {
		
		int id;
		String name;
		
		public Builder(int id) {
			this.id = id;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public GroupBuilder build() {
			return new GroupBuilder(this);
		}
	}

}
