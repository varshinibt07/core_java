package com.xworkz.corejava.Arrar_as_DAO.DAO;

import com.xworkz.corejava.Arrar_as_DAO.DTO.StudentDTO;

public class StudentDAOImpl implements StudentDAO {

	StudentDTO[] students = new StudentDTO[10];

	

	@Override
	public void addStudent(StudentDTO dto) {
		students[0]=dto;
	}

	@Override
	public StudentDTO getStudent(long phno) {
		int index=-1;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getPhno() == phno) {
				//System.out.println(students[i]);
				index = i;
				break;
				
			}
			}
		if(index==-1)
		return null;
		else
			return students[index];

	}

	@Override
	public void updateStudent(StudentDTO dto) {
		for(int i=0; i< students.length; i++) {
			int count = 0;
			for (int i1=0; i1< students.length; i1++) {
				if(students[i1] != null && students[i1].getPhno() == dto.getPhno()) {
					count++;
					students[i1].setId(dto.getId());
					students[i1].setName(dto.getName());
					students[i1].setBatchname(dto.getBatchname());
					students[i1].setPercentage(dto.getPercentage());

				}
			}
			if(count == 0) {
				System.out.println("student not found");
			}

		}
		}

	@Override
	public void deleteStudent(StudentDTO dto) {
		int count = 0;
		for (int i=0; i< students.length; i++) {
			if( students[i] != null && students[i].getName() == dto.getName()) {
				for(int j=i; j<students.length-1;j++) {
					students[j] = students[j+1];
					count++;
				}
				 break;
			}
		}	
		if(count > 0) {
			System.out.println("Student: phone Number " +dto.getName() +" " + dto.getPhno() + " deleted from the array" );
		}
		
		else {
			System.out.println("Invalid Details");
		}
		
	}}