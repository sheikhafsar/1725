import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program to Compute Factorial.");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int num=sc.nextInt();
	
		System.out.println(" Factorial of "+num+" is " + Factorial.calFactorial(num));
	}
	

}
