
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staff staff1= new TeachingStaff();
		Staff staff2= new NonTeachingStaff();
		ContractTeacher staff3= new ContractTeacher();
		
		staff1.calculateSalary();
		staff2.calculateSalary();
		staff3.calculateSalary();
		staff3.makePayment();
		staff3.calcWorkingHours();
	}

}
