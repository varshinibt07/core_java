package com.xworkz.corejava.Has_a_relation;

public class Human {
	
	int bones;
	String blood;
     Heart heart;
     
     Void heartbeat() {
    	 System.out.println("Hearts beats 72 per times per minute");
    	 return heartbeat();
     }

}


