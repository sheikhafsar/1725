
public class TeachingStaff extends Staff {

	int noOfTeachingHours;
	
	public TeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeachingStaff(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Calculating Salary for teaching Staff");
	}

	public int getNoOfTeachingHours() {
		return noOfTeachingHours;
	}

	public void setNoOfTeachingHours(int noOfTeachingHours) {
		this.noOfTeachingHours = noOfTeachingHours;
	}

}
