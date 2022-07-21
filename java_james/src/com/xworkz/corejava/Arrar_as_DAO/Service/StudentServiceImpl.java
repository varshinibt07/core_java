package com.xworkz.corejava.Arrar_as_DAO.Service;

import com.xworkz.corejava.Arrar_as_DAO.DAO.StudentDAO;
import com.xworkz.corejava.Arrar_as_DAO.DAO.StudentDAOImpl;
import com.xworkz.corejava.Arrar_as_DAO.DTO.StudentDTO;

public class StudentServiceImpl implements StudentService {

	StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	public void addStudent(StudentDTO dto) {
		long number = dto.getPhno();
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		if (count == 10) {
			studentDAO.addStudent(dto);
			System.out.println(dto);
		}

		else {
			System.out.println("Invalid number");
		}
	}

	@Override
	public StudentDTO getStudent(long phno) {
		return studentDAO.getStudent(phno);
	}

	@Override
	public void updateStudent(StudentDTO dto) {
		       long number = dto.getPhno();
		       int count = 0;
		       while (number>0) {
		    	   number = number/10;
		    	   count++;
		       }
		          if (count == 10) {
					studentDAO.updateStudent(dto);
					System.out.println(dto);
				}

				else {
					System.out.println("Invalid number");
				}
			}

	@Override
	public void deleteStudent(StudentDTO dto) {
		long number = dto.getPhno();
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		if (count == 10) {
			studentDAO.deleteStudent(dto);
			System.out.println(dto);
		}

		else {
			System.out.println("Invalid number");
		}
	
		
	}
	

	}