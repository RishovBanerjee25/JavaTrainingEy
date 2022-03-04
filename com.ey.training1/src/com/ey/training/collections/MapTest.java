package com.ey.training.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer,String> myMap = new HashMap<>();
		myMap.put(1, "java");  // K,V - Entry
		myMap.put(2, "python");
		myMap.put(3, "C#");

		System.out.println(myMap.get(3));

		System.out.println(myMap.keySet());

		System.out.println(myMap.values());

		System.out.println(myMap);

		for (Map.Entry obj : myMap.entrySet()) {
			System.out.println(obj.getKey() + " - "+ obj.getValue());
		}


		System.out.println(myMap.size());

		myMap.remove(2);

		System.out.println(myMap);

		myMap.clear();

		System.out.println(myMap);

		myMap.put(1, "java");  // K,V - Entry
		myMap.put(2, "python");
		myMap.put(3, "C#");



		System.out.println(myMap);

		myMap.replace(2, "C");

		System.out.println(myMap);

		myMap.put(3, "C####");

		System.out.println(myMap);


		Map<Integer,EmployeeData> employeeDataMap = new HashMap<>();
		employeeDataMap.put(1, new EmployeeData(1, "Ravi"));
		employeeDataMap.put(23,new EmployeeData(2, "Raghu"));
		employeeDataMap.put(35, new EmployeeData(3, "Ratan"));
		
		
		System.out.println(employeeDataMap);
		
		for (Map.Entry<Integer,EmployeeData> employee : employeeDataMap.entrySet()) {
			System.out.println(employee.getKey() + " - "+ employee.getValue().getId() + "-" + employee.getValue().getName());
		}

		
		Map<Integer,String> myLinkedHM = new LinkedHashMap<>();
		myLinkedHM.put(1, "java");  // K,V - Entry
		myLinkedHM.put(2, "python");
		myLinkedHM.put(3, "C#");
		
		System.out.println(myLinkedHM);
		
		TreeMap<Integer,String> myTreeMap = new TreeMap<>();
		myTreeMap.put(2,"Ravi");
		myTreeMap.put(500,"Raghu");
		myTreeMap.put(1, "STS");
		
		System.out.println(myTreeMap);
		
		Hashtable<Integer,String> hashTab = new Hashtable<>();
		hashTab.put(2,"Ravi");
		hashTab.put(500,"Raghu");
		hashTab.put(1, "STS");
		
		System.out.println(hashTab);

	}

}

class EmployeeData{

	int id;
	String name ;

	public EmployeeData(int id , String name) {
		this.id = id;
		this.name = name ;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
