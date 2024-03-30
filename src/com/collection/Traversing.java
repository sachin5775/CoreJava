package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Traversing {
	public static void main(String[] args) {
		ArrayList<Double> arrayList = new ArrayList<>();
		arrayList.add(33.32);
		arrayList.add(22.11);
		arrayList.add(88.77);
		arrayList.add(77.32);
		arrayList.add(45.11);
		arrayList.add(88.77);

		System.out.println("---------USING FOR EACH-----------");
		for (Double double1 : arrayList) {
			System.out.println(double1);
		}

		System.out.println("===========USING ITERATOR==========");
		Iterator<Double> itr = arrayList.iterator();
		while (itr.hasNext()) {
			Double double1 = itr.next();
			System.out.println(double1);
		}

		System.out.println("=========USING LISTITERATOR=========");
		ListIterator<Double> listIterator = arrayList.listIterator(arrayList.size());
		while (listIterator.hasPrevious()) {
			Double double1 = listIterator.previous();
			System.out.println(double1);

		}

		System.out.println("=======USING FOR EACH METHOD=========");
		arrayList.forEach(d -> {
			System.out.println(d);
		});

		System.out.println("=======Traversing of set==============");
		HashSet<Double> hashSet = new HashSet<>();
		hashSet.addAll(arrayList);
		hashSet.add(77.32);
		System.out.println("---------USING FOR EACH-----------");
		for (Double double1 : hashSet) {
			System.out.println(double1);
		}
		System.out.println("========USING ITERATOR===========");
		Iterator<Double> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Double double1 = (Double) iterator.next();
			System.out.println(double1);
		}
		System.out.println("=========USING FOR EACH METHOD=========");
		hashSet.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("=========ITERATOR ON TREESET=============");
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.addAll(hashSet);
		System.out.println("=========ITERATOR ON TREESET DECENDING=============");

		Iterator<Object> descendingIterator = treeSet.descendingIterator();
		while (descendingIterator.hasNext()) {
			Object object = (Object) descendingIterator.next();
			System.out.println(object);
		}

		System.out.println("=========ITERATOR ON TREESET ASCENDING=============");
		Iterator<Object> iterator2 = treeSet.iterator();
		while (iterator2.hasNext()) {
			Object object = (Object) iterator2.next();
			System.out.println(object);
		}
		
		System.out.println("==========MAP=================");
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("java", 1);
		hashMap.put("one", 2);
		hashMap.put("thre", 3);
		hashMap.put("two", 4);
		hashMap.put("three", 5);
		
		System.out.println("==============USING ENTRY SET===============");
		Set<Entry<String, Integer>> entrySet1 = hashMap.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet1) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key +" ==> "+ val);
			
		}
		
		System.out.println("=============Using for each method===========");
		hashMap.forEach((key,value)->{
			System.out.println(key +" ==> "+ value);
		});
		
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Sachin", 1000);
		linkedHashMap.putAll(hashMap);
		
		System.out.println("=============Using for each method linked hash map===========");
		linkedHashMap.forEach((key,value)->{
			System.out.println(key +" ==> "+ value);
		});
		System.out.println("==============Sorted using tree map===========");
		TreeMap<Object, Object> treeMap = new TreeMap<>();
		treeMap.putAll(hashMap);
		treeMap.forEach((key,value)->{
			System.out.println(key +"  ==> "+ value);
		});
		System.out.println("=============treem map using entrySet==========");
		Set<Entry<Object, Object>> entrySet = treeMap.entrySet();
		for(Map.Entry<Object, Object> entry:entrySet) {
			System.out.println(entry.getKey()+" ====> "+entry.getValue());
		}

	}
}
