package com.xworkz.corejava.Arrar_as_DAO.DAO;

import com.xworkz.corejava.Arrar_as_DAO.DTO.StudentDTO;

public interface StudentDAO {
	
	void addStudent(StudentDTO dto);
	StudentDTO getStudent(long phNo);
    void updateStudent(StudentDTO dto);
    void deleteStudent(StudentDTO dto);
}


