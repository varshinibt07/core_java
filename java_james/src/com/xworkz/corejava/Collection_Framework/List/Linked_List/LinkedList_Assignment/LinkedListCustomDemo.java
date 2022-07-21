package com.xworkz.corejava.Collection_Framework.List.Linked_List.LinkedList_Assignment;

import java.util.LinkedList;

public class LinkedListCustomDemo {

	public static void main(String[] args) {
		HandBag hb = new HandBag();
		hb.setBrand("Gucci");
		hb.setColor("Black");
		hb.setPrice(7000.0);
		
		HandBag LeatherBag = new HandBag();
		LeatherBag.setBrand("Lavie");
		LeatherBag.setColor("Brown");
		LeatherBag.setPrice(4500.0);
		
		
		LinkedList<HandBag> ll = new LinkedList<HandBag>();
		
		 ll.add(LeatherBag);
		 ll.add(hb);
		 System.out.println(ll);
		 
		 for(HandBag ll1:ll)
			 if(ll1.getPrice()==4500)
		
		System.out.println(ll1);
		}

	}


