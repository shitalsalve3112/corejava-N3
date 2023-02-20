package org.tnif.hierachicalInheritance;

public class Androidversion {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Androidversion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Androidversion(String type) {
		super();
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + "]";
	}
	
}

