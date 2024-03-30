package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionPracticeSet {
	public static void main(String[] args) {
		//not preserve order
		HashSet<Double> hashSet = new HashSet<>();
		hashSet.add(33.32);
		hashSet.add(22.11);
		hashSet.add(88.77);
		hashSet.add(77.32);
		hashSet.add(45.11);
		hashSet.add(88.77);// no duplicate

		System.out.println(hashSet);
		
		
		//preserve order
		LinkedHashSet<Double> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(33.32);
		linkedHashSet.add(22.11);
		linkedHashSet.add(88.77);
		linkedHashSet.add(77.32);
		linkedHashSet.add(45.11);
		linkedHashSet.add(88.77);// no duplicate
		linkedHashSet.add(null);
		

		System.out.println(linkedHashSet);
		
		//sorted
		TreeSet<Double> treeSet = new TreeSet<>();
		treeSet.add(33.32);
		treeSet.add(22.11);
		treeSet.add(88.77);
		treeSet.add(77.32);
		treeSet.add(45.11);
		treeSet.add(88.77);// no duplicate no null allwed
		//treeSet.add(null);
		
		System.out.println(treeSet);
		
		
	}
}
