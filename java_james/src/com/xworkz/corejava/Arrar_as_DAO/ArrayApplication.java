package com.xworkz.corejava.Arrar_as_DAO;

import com.xworkz.corejava.Arrar_as_DAO.DTO.StudentDTO;
import com.xworkz.corejava.Arrar_as_DAO.Service.StudentService;
import com.xworkz.corejava.Arrar_as_DAO.Service.StudentServiceImpl;

public class ArrayApplication {

	public static void main(String[] args) {

	   StudentDTO dto = new StudentDTO("1","Varshini","BTM01",9538687503l,"70%");
	   StudentService service = new StudentServiceImpl();
       service.addStudent(dto);
		
		StudentDTO student = service.getStudent(9538687503l);

	    System.out.println("Student Details :");
	    System.out.println(student);
	    
	    student.setName("Psycho");
	    service.updateStudent(student);
	    service.deleteStudent(dto);
	    
	    
	}
}