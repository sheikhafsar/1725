import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stringList = new ArrayList<>();
		List<Integer> integerList = new ArrayList<>();
		
		stringList.add("hello");
		stringList.add("hi");
		stringList.add("bye");
		integerList.add(33);
		integerList.add(7);
		integerList.add(40);
		
		PrintList(stringList);
		PrintList(integerList);
		
	}
	
	static <A> void PrintList(List<A> myList ){
		
		Iterator<A> myIterator = myList.iterator();
		
		while(myIterator.hasNext()) {
			System.out.print(myIterator.next() + "...");
		}

	}
}
