package com.xworkz.corejava.Collection_Framework.Set.HashSet.Service;

import com.xworkz.corejava.Collection_Framework.Set.HashSet.DAO.TrainDAO;
import com.xworkz.corejava.Collection_Framework.Set.HashSet.DAO.TrainDAOImpl;
import com.xworkz.corejava.Collection_Framework.Set.HashSet.DTO.TrainDTO;

public class TrainServiceImpl implements TrainService {

	TrainDAO trainDAO = new  TrainDAOImpl();
	
	@Override
	public void addTrain(TrainDTO dto) {
		
		int number =dto.getNumber();
		if(number!=0) {
			trainDAO.addTrain(dto);
			System.out.println(dto);
		}
		else {
			System.out.println(" Train number is invalid");
		}
		
	}

	@Override
	public TrainDTO getTrain(int number) {
		
		return trainDAO.getTrain(number);
	}

	public void updateTrain(TrainDTO dto) {
		int number =dto.getNumber();
		if(number!=0) {
			trainDAO.updateTrain(dto);
		}
		else {
			System.out.println("Train number is invalid");
		}
		
		
	}

	@Override
	public void deleteTrain(TrainDTO dto) {
		trainDAO.deleteTrain(dto);
		
		
	}

}
