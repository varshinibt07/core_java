package com.xworkz.corejava.Has_a_relation;

public class HeartMainMethod {
	public static void main(String[] args) {
		Human human = new Human();
		human.heart = new Heart();
		human.heart.location = "left";
		human.blood="Red";
		human.bones=206;
		
		
		System.out.println("Human have blood:" + human.blood);
		System.out.println("human have these many bones:" + human.bones);
		System.out.println("Heartliesin:" + human.heart.Heartbeats);
		System.out.println("Heartliesin:" + human.heart.location);
		

	}

}
