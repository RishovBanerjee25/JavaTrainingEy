package com.ey.training.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamTest {

	public static void main(String[] args) {

				List<Integer> numList = Arrays.asList(10,4,17,1,2,3,4,5,6,7,8);
				
			
				numList.stream().forEach(x -> System.out.println(x));
		//		
//				numList.stream().forEach(System.out::println);

		//print only even numbers from a collection using lambda's

//				numList.stream().filter(x -> x%2 == 0).forEach(System.out::println);

//				long count = numList.stream().count();

		//		System.out.println(count);

		//		Integer sum = numList.stream().reduce(0, (a,b)-> a+b);
		//		System.out.println(sum);

		//		 Integer mul = numList.stream().reduce(1, (a,b)-> a*b);
		//		
		//		 System.out.println(mul);

		//		List<Integer> li = numList.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		//		System.out.println(li);

		//		numList.stream().map(val -> val+5).forEach(System.out::println);

		//		List<String> strList = Arrays.asList("Java","Python","Jdk","JRE","DotNet");

		//		List<Map<String,List<Integer>>> str

		//		strList.stream().filter(x->x.startsWith("J")).map(y -> y.toUpperCase()).forEach(z->System.out.println(z));

		//		Optional<String> obj = strList.stream().filter(x->x.startsWith("J")).findFirst();
		//		String str = obj.get();
		//		System.out.println(str);
		//		
		//		String obj1 = strList.stream().filter(x->x.startsWith("j")).findAny().orElse("no value");
		//		System.out.println(obj1);

		//		strList.stream().sorted().forEach(x->System.out.println(x));

//				List<Person> personList = Arrays.asList(new Person(3,"John"),new Person(1,"Dessi"),new Person(1,"Bessi"),new Person(2,"Raghu"));
//				
//				System.out.println("Sort by ID ============================");
//				personList.stream().sorted(Comparator.comparing(p -> p.getId())).forEach(person->{  //lambda expression ->
//					System.out.println(person.getId() + "  -  "+person.getName());
//				});
//				
//				System.out.println("Sort by Name =========================");
//				personList.stream().sorted(Comparator.comparing(Person::getName).reversed()).forEach(person->{  //method references ::
//					System.out.println(person.getId() + "  -  "+person.getName());
//				});
//				
//				System.out.println("Sort by ID & NAmE  =========================");
//				personList.stream().sorted(Comparator.comparing(Person::getId).thenComparing(Person::getName).reversed()).forEach(p->{
//					System.out.println(p.getId() + "-"+p.getName());
//				});


//				Map<Integer,String> myMap = new HashMap<>();
//				myMap.put(4,"Dessi");
//				myMap.put(2, "Bessi");
//				myMap.put(3, "John");
//				myMap.put(1, "Raghu");
//
//				System.out.println("========================================");
//				myMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entrySet-> {
//					System.out.println(entrySet.getKey() + " - "+entrySet.getValue());
//				});
//				
//				System.out.println("========================================");
//				myMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entrySet-> {
//					System.out.println(entrySet.getKey() + " - "+entrySet.getValue());
//				});
//				System.out.println("========================================");
//				myMap.keySet().stream().forEach(key -> System.out.println(key));
//				System.out.println("========================================");
//				myMap.values().stream().forEach(value -> System.out.println(value));
		

//		Map<Integer,Person> personMap = new HashMap<>();
//		personMap.put(2, new Person(2, "Bessi"));
//		personMap.put(4, new Person(4,"Dessi"));
//		personMap.put(3, new Person(2, "John"));
//		personMap.put(1, new Person(1, "Raghu"));

		//		personMap.entrySet().stream().forEach(personES ->{
		//			System.out.println(personES.getKey() +" - "+personES.getValue().getId()+"::"+personES.getValue().getName());
		//		});

		//		personMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(personES ->{
		//			System.out.println(personES.getKey() +" - "+personES.getValue().getId()+"::"+personES.getValue().getName());
		//		});

//		personMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Person::getId)
//				.thenComparing(Person::getName))).forEach(personES ->{
//			System.out.println(personES.getKey() +" - "+personES.getValue().getId()+"::"+personES.getValue().getName());
//		});
		
//		personMap.entrySet().stream().forEach(null);
//		personMap.entrySet().


	}



}

class Person{

	int id ;
	String name;

	public Person(int id , String name) {
		this.id  = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}



}
