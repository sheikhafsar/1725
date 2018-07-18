
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staff staff1= new TeachingStaff();
		Staff staff2= new NonTeachingStaff();
		
		staff1.calculateSalary();
		staff2.calculateSalary();
	}

}
