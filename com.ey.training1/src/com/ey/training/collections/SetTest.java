package com.ey.training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

		Set<Integer> intSet = new HashSet<>();
		intSet.add(1);
		intSet.add(2);
		intSet.add(1);
		intSet.add(4);

		System.out.println(intSet);

		Set<String> strSet = new HashSet<>();
		strSet.add("Java");
		strSet.add("python");
		strSet.add("C++");
		strSet.add("VC++");
		strSet.add("java");
		strSet.add("python");

		System.out.println(strSet);

		Iterator<String> itr = strSet.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("remove VC++");

		strSet.remove("VC++");

		System.out.println(strSet);

		strSet.clear();

		System.out.println(strSet);

		Set<String> strSet2 = new HashSet<>();
		strSet2.add("Java2");
		strSet2.add("python2");

		strSet.addAll(strSet2);

		System.out.println(strSet);

		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(1,"Prudhvi"));
		empSet.add(new Employee(2,"Prudhvi2"));
		empSet.add(new Employee(3,"Prudhvi2"));

		System.out.println(empSet);
		
		for (Employee employee : empSet) {
			System.out.println(employee.getId() +" - "+employee.getName());
		}

		Set<String> linkedSet = new LinkedHashSet<>();
		
		linkedSet.add("java");
		linkedSet.add("name");
		linkedSet.add("python");
		
		System.out.println(linkedSet);
		
		TreeSet<String> treSet = new TreeSet<>();
		treSet.add("Ravi");
		treSet.add("Abhi");
		treSet.add("Naveen");
		treSet.add("Bunny");
		
		System.out.println(treSet);
		
		Iterator itr2 = treSet.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println(treSet.pollFirst());
		System.out.println(treSet.pollLast());
	}

}

class Employee{

	int id;
	String name;

	public Employee(int id , String name) {
		this.id = id;
		this.name  = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
