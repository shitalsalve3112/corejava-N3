package AccessSpecifiersDemo;

public class AccessSpecifierExample {

//Data members
	private String name;
	
//Defaultdata member is default it will access only inside the package
	public void display() {
		System.out.println("The name is:"+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
}
