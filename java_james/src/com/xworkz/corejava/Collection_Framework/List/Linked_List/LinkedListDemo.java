package com.xworkz.corejava.Collection_Framework.List.Linked_List;

import java.util.LinkedList;

public class LinkedListDemo {

			public static void main(String[] args) {
				
				LinkedList ll = new LinkedList();
				
				ll.add("Hi varshini");
				ll.add(null);
				ll.add("java");
				ll.add("GeeksforGeeks varshini");
				
				System.out.println(ll);
				
				ll.addFirst("Varshini");
				System.out.println(ll);
				
				ll.addLast(1260);
				System.out.println(ll);
				
				System.out.println("------------");
				System.out.println(ll.getFirst());
				
				System.out.println("------------");
				System.out.println(ll.getLast());
				
				System.out.println("------------");
				System.out.println(ll.removeFirst());
				
				System.out.println("------------");
				System.out.println(ll.removeLast());
				
				System.out.println("------------");
				System.out.println(ll);
				
			}
	}


