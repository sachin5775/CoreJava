package com.collection;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionPracticeList {
	ArrayList<Integer> list = new ArrayList<>();

	public CollectionPracticeList(int a) {
		list.add(a);
	}

	public static void main(String[] args) {
		CollectionPracticeList cp = new CollectionPracticeList(3);
		CollectionPracticeList cp1 = new CollectionPracticeList(3);
		// type safe
		ArrayList<CollectionPracticeList> arrayList = new ArrayList<>();
		
		arrayList.add(cp);
		arrayList.add(cp);
		arrayList.add(cp);
		arrayList.add(cp);
		arrayList.add(cp);
		System.out.println(arrayList);
		System.out.println(arrayList.contains(cp1));
		arrayList.clear();
		System.out.println(arrayList.contains(cp1));
		System.out.println(cp1);
		System.out.println(arrayList);

		// unsafe type 
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add("Sachin");
		arrayList2.add(100);
		arrayList2.add(300.2);
		arrayList2.add(null);

		arrayList2.add("Divya");
		arrayList2.add(3);
		System.out.println(arrayList2);

		// remove element arrayList.remove(null); arrayList2.remove(3);
		arrayList2.remove(Integer.valueOf(3));
		System.out.println(arrayList);
		System.out.println(arrayList2);

		System.out.println(arrayList.contains("Navjeet"));
		System.out.println(arrayList.contains("Dhanashree"));
		System.out.println(arrayList.size());
		
		System.out.println(cp.hashCode());;

		
		LinkedList<Double> linkedList = new LinkedList<>();
		linkedList.add(33.32);
		linkedList.add(22.11);
		linkedList.add(88.77);
		linkedList.add(77.32);
		linkedList.add(45.11);
		linkedList.add(88.77);
		
		linkedList.add(3, 66.22);
		linkedList.set(2, 11.33);
		System.out.println(linkedList);
	}
	
	

	
	@Override
	public int hashCode() {
		return 22222;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}

}
