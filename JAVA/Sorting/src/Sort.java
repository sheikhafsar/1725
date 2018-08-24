
public class Sort {

	//static --> we can use static methods without creating an instance of class
	
	public static void bubbleSort(int arr[]) {
		
		int n=arr.length;
		
		
	//	System.out.println("n="+ n);
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				
				if(arr[i]<arr[j]) {
					//swap
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
	}
	
	public static void printArray(int arr[]){
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] );
		}
		
		
	}
	

}
