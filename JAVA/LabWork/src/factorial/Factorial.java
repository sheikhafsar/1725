package factorial;

public class Factorial {
	
	public static Integer calculateFactorial_recursion(Integer number) {
		if (number == 0) { 
			return 1;    
		}
		else { 
			return(number * calculateFactorial_recursion(number - 1));   
		}
	}
	public static Integer calculateFactorial(Integer number) {
		Integer factorial = 1;
		while(number > 1) {
			factorial *= (number--);
		}
		return factorial;
	}
}
