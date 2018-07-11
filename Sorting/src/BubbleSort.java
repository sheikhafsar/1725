
public class BubbleSort {

	
	public void bubble(int arr[]) {
		
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
	
	public void printArray(int arr[]){
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] );
		}
		
		
	}
	

}
