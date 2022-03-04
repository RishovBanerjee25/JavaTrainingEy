package com.ey.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		
//		List<Integer> inList = new ArrayList<>();  //0 index to length-1 index
//		
//		//[1,2,3,4,5,6,7,8]
//		// 0 1 2 3 4 5 6 7  [0-7]
//		inList.add(10);  //0
//		inList.add(20);  //1
//		inList.add(600);  //2
//		
//		System.out.println(inList);
//		
//		System.out.println(inList.get(2));
//		
//		for(int i =0 ; i< inList.size() ; i++) {
//			System.out.println(inList.get(i));
//		}
		
//		List<String> strList = new ArrayList<>();
//		strList.add("Java");
//		strList.add("Python");
//		strList.add("VC++");
		
//		System.out.println(strList);
		
//		for (String x : strList) {
//			System.out.println(x);
//		}
		
//		Student s1 = new Student(1,"Prudhvi");
//		Student s2 = new Student(2,"Prudhvi2");
//		Student s3 = new Student(3,"Prudhvi2");
		
//		List<Student> studentsList = new ArrayList<>();
//		studentsList.add(new Student(1,"Prudhvi"));  //0
//		studentsList.add(new Student(2,"Prudhvi2"));  //1
//		studentsList.add(new Student(3,"Prudhvi3"));  //2
		
//		System.out.println(studentsList.get(0).getId()  +" - "+studentsList.get(0).getName());
//		System.out.println(studentsList.get(1).getId()  +" - "+studentsList.get(1).getName());
//		System.out.println(studentsList.get(2).getId()  +" - "+studentsList.get(2).getName());
		
//		for (int i = 0; i < studentsList.size(); i++) {
//			System.out.println(studentsList.get(i).getId()  +" - "+studentsList.get(i).getName());
//		}
		
		
		List<Integer> inList = new ArrayList<>();  //0 index to length-1 index
		
		inList.add(10);  //0
		inList.add(20);  //1
		inList.add(600);  //2
		
		System.out.println("=java 8=");
		inList.forEach(System.out::println);
		System.out.println("=java 8=");
		
		System.out.println(inList);
		
		inList.add(1, 1000);
		System.out.println(inList);
		
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		
		inList.addAll(myList);
		
		System.out.println(inList);
		
//		inList.clear();
		
		System.out.println(inList);
		
		System.out.println(inList.contains(1000));
		
		System.out.println(inList.contains(200));
		
		System.out.println(inList.size());
		
		System.out.println(inList.isEmpty());
		
		inList.remove(1);
		
		System.out.println(inList);
		
		Collections.sort(inList);
		
		
		System.out.println(inList);
		
		System.out.println("using itr ===================");
		Iterator<Integer> itr = inList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		ListIterator<Integer> liITR = inList.listIterator(inList.size());
		while(liITR.hasNext()) {
			System.out.println(itr.next());
		}
		
		while(liITR.hasPrevious()) {
			System.out.println(liITR.previous());
		}
		
		
	}

}
class Student{
	
	int id;
	String name;
	
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
