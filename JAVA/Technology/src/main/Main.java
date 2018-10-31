package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import modules.Device;
import modules.Hardware;
import modules.Technology;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iterator myItr;
		
		//Technology tech1=new Technology("Computer");
		
		//Hardware hw1=new Hardware("CPU",10);
	//	hw1.getLicenseType();
		
	//	Device dv1= new Device("Monitor",2000);
		//tech1.getName();
		
		
		List<Technology> techList = new ArrayList<>();

		techList.add(new Technology("Computer"));
		techList.add(new Technology("Mobile"));
		techList.add(new Technology("Laptop"));
		
		myItr = techList.iterator();
		System.out.println("\nTechnology List");
		printTechCollection(myItr);
		
		//DEvices
		List<Device> deviceList = new ArrayList<>();
		
		deviceList.add(new Device("Monitor",2000));
		deviceList.add(new Device("Keyboard",800));
		deviceList.add(new Device("Mouse",600));
		
		myItr = deviceList.iterator();
		System.out.println("\nDevices List");
		printDeviceCollection(myItr);
		
		/*
		Map<Integer, Technology> techMap = new HashMap<>();
		
		techMap.put(1,new Technology("Computer"));
		techMap.put(2, new Technology("Mobile"));
		techMap.put(3,new Technology("Laptop"));
		
		techMap.keySet(); // set of all keys in map
		techMap.values(); //collection of all values in map
		
		myItr = techMap.entrySet().iterator();
		System.out.println("\ntechMap number== " + techMap);
		System.out.println("\ntechMap entryset== " + techMap.entrySet());
		
		System.out.println("\nMap=");
		//printCollection(myItr);
		printMap(myItr);
		
		*/
		
	}

	static void printTechCollection(Iterator myItr) {
		while(myItr.hasNext()) {
			System.out.print(((Technology) myItr.next()).getName() + "  ");
		}
	}
	
	static void printDeviceCollection(Iterator myItr) {
		while(myItr.hasNext()) {
			//System.out.print(((Device) myItr.next()).getDeviceName() +": " + ((Device) myItr.next()).getCost() + "  ");
			System.out.print(((Device) myItr.next()).getDeviceName() + "  ");
		}
	}

	
	/*
	static void printMap(Iterator myItr) {
		while(myItr.hasNext()) {
			Map.Entry<Integer, Technology> techRecord = (Entry<Integer, Technology>) myItr.next();
			System.out.println(techRecord.getKey() + "->" + techRecord.getValue().getName());
		}
	}
	*/
	

}
