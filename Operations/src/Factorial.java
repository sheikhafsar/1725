
public class Factorial {
	
	
	
	public static int calFactorial(int num) {
		
		
		System.out.println("num="+num);
		
/*		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
*/
		if(num == 0)
		{
			return 1;
		}
		else 
		{
			return (num * calFactorial(num-1));
		}
		
	}
	
}
