
public class ContractTeacher extends Staff implements Pay, Schedule {

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("This is to Calculate Salary to Contract Faculty");
	}

	public void makePayment(){
		System.out.println("This is to Pay Salary to Contract Faculty");
	}
	
	public void calcWorkingHours(){
		System.out.println("This is to calculate Working Hours of Contract Faculty");
	}
}
