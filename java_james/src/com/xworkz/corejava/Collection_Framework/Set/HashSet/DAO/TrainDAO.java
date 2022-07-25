package com.xworkz.corejava.Collection_Framework.Set.HashSet.DAO;

import com.xworkz.corejava.Collection_Framework.Set.HashSet.DTO.TrainDTO;

public interface TrainDAO {
	void addTrain(TrainDTO  dto);
	TrainDTO getTrain(int number);
	void updateTrain(TrainDTO dto);
	void deleteTrain(TrainDTO dto);
	

}
