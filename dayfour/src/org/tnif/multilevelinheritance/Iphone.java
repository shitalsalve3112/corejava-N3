package org.tnif.multilevelinheritance;

//chid class2
public class Iphone extends Android{

	private String Slottype;
	public void slot()
	{
		System.out.println("slottype is:"+Slottype);
	}
	//getters and setters
	public String getSlottype() {
		return Slottype;
	}
	public void setSlottype(String slottype) {
		this.Slottype = slottype;
	}
//default constructor
	public Iphone(String slottype) {
		super();
		
	}
	
	public Iphone(int model, String Version, String slottype) {
	super();
	this.Slottype = slottype;
}
	@Override
	public String toString() {
		return "Iphone [Slottype=" + Slottype + "]";
	}
	
}
