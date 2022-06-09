package com.xworkz.corejava.Has_a_relation;

public class Mainmethod {

	public static void main(String[] args) {
	Library library=new Library();
	 library.student=new Student();
	 library.student.id=22;
	 library.student.name="Bhoomika";
	 library.student.baranch="CS";
	library.name="Central Library";
	library.location="BTM";
	 
	 System.out.println("library name"+library.name);
	 System.out.println("library location"+library.location);
	 System.out.println("student name"+library.student.name);
	 System.out.println("Student name"+library.student.baranch);
	 System.out.println("Student name"+library.student.id);
	 
	 
	 
	 
	 
	 
	 
	 

}
}
