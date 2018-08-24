
public abstract class Staff {
	String name;
	
	public abstract void calculateSalary();
	
	public Staff() {
		name="";
	}

	public Staff(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
