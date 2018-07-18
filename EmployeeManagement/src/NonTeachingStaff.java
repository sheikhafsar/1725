
public class NonTeachingStaff extends Staff {

	int noOfLeaves;
	
	public NonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonTeachingStaff(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Calculating Salary for non teaching Staff");
	}

	public int getNoOfLeaves() {
		return noOfLeaves;
	}

	public void setNoOfLeaves(int noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}

}
