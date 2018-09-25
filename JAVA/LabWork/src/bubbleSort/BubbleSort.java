package bubbleSort;

public class BubbleSort {
	public static Integer[] sort(Integer data[]) {
		System.out.print("Before Sort::");
		printArray(data);
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < i; j++) {
				if(data[i] < data[j]) {
					data[i] += data[j];
					data[j] = data[i] - data[j];
					data[i] = data[i] - data[j];
				}
			}
		}
		System.out.print("After Sort::");
		printArray(data);
		return data;
	}
	public static void printArray(Integer data[]) {
		for(int i = 0; i < data.length; i++) {
			System.out.print("..." + data[i]);
		}
		System.out.println();
	}
	public BubbleSort(String name, String date) {
		
	}
}
