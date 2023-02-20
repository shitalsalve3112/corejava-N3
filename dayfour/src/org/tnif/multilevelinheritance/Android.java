package org.tnif.multilevelinheritance;

//child class
public class Android extends Nokia { 
	private String version;
	void accept()
	{
		System.out.println("The Android Version Name Is :"+version);
	}
//getters and setters
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Android() {
		super();
	}
//parameterised constructor
	public Android(String version) {
		super();
		this.version = version;
	}
	
	
}
