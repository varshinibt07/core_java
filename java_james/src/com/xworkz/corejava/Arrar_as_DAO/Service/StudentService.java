package com.xworkz.corejava.Arrar_as_DAO.Service;

import com.xworkz.corejava.Arrar_as_DAO.DTO.StudentDTO;

public interface StudentService {
	void addStudent(StudentDTO  dto);
	StudentDTO getStudent(long phno);
	void updateStudent(StudentDTO dto);
	void deleteStudent(StudentDTO dto);
	

}

