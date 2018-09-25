package temporary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import bubbleSort.BubbleSort;

public class CollectionTest {
	public static void main(String args[]) {
		List<BubbleSort> mylist = new ArrayList<>();
		mylist.add(new BubbleSort("name", "date"));
		BubbleSort bs = new BubbleSort("", "");
		mylist.add(bs);
		
		/*
		List<String> team = new ArrayList<>();
		team.add("hello");
		team.add("bye");
		team.add("tata");
		System.out.println("size= " + team.size());
		System.out.println("at 0th = " + team.get(0));
		team.remove(0);
		for(String i : team) {
			System.out.println("-->" + i);
		}
		
		Iterator<String> myIterator = team.iterator();
		while(myIterator.hasNext()) {
			System.out.println("@@@> " + myIterator.next());
		}
		*/
		
		Iterator myItr;
		
		List<Integer> rollnoList = new ArrayList<>();
		rollnoList.add(1701);
		rollnoList.add(1702);
		rollnoList.add(1703);
		System.out.println("rollnoList= " + rollnoList);
		rollnoList.add(1702);
		System.out.println("rollnoList== " + rollnoList);
		
		Set<Integer> rollnoSet = new TreeSet<>();
		rollnoSet.add(1701);
		rollnoSet.add(1702);
		rollnoSet.add(1703);
		System.out.println("rollnoSet= " + rollnoSet);
		rollnoSet.add(1702);
		System.out.println("rollnoSet== " + rollnoSet);
		
		myItr = rollnoList.iterator();
		System.out.println("\nList=");
		printCollection(myItr);
		
		myItr = rollnoSet.iterator();
		System.out.println("\nSet=");
		printCollection(myItr);
		
		Map<Integer, String> studentRoll = new HashMap<>();
		studentRoll.put(1, "Bond");
		studentRoll.put(2, "James");
		studentRoll.put(3, "Aston");
		studentRoll.put(4, "=Martini");
		studentRoll.keySet(); // set of all keys in map
		studentRoll.values(); //collection of all values in map
		
		myItr = studentRoll.entrySet().iterator();
		System.out.println("\nStudentRoll== " + studentRoll);
		System.out.println("\nStudentRoll entryset== " + studentRoll.entrySet());
		System.out.println("\nMap=");
		//printCollection(myItr);
		printMap(myItr);
		
		System.out.println("-->" + studentRoll.get(3));
	}
	static void printCollection(Iterator myItr) {
		while(myItr.hasNext()) {
			System.out.print(myItr.next() + "..");
		}
	}
	
	
	
	
	static void printMap(Iterator myItr) {
		while(myItr.hasNext()) {
			Map.Entry<Integer, String> studentRecord = (Entry<Integer, String>) myItr.next();
			System.out.println(studentRecord.getKey() + "->" + studentRecord.getValue());
		}
	}
}
