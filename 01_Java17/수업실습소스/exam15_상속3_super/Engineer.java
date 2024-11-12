package exam15_상속3_super;

public class Engineer extends Employee {

	String name="Engineer";
	public String getName() {
		return name; // this.name
	}
	public String getSuperName() {
		return super.name; 
	}
	public String getName2() {
		return getName();  // this.name()
	}
	public String getSuperName2() {
		return super.getName(); 
	}
}
