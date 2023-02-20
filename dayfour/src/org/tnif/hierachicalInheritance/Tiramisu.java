package org.tnif.hierachicalInheritance;

//child classs
//
public class Tiramisu {

	private String type;

	public String getType() {
		return type;
	}
//getters and setters
	public void setType(String type) {
		this.type = type;
	}
// default
	public Tiramisu() {
		super();
		// TODO Auto-generated constructor stub
	}
//parameterised
	public Tiramisu(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Tiramisu [type=" + type + ", toString()=" + super.toString() + "]";
	}

	
	
}
