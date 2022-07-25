package com.xworkz.corejava.Collection_Framework.Set.HashSet.Service;

import com.xworkz.corejava.Collection_Framework.Set.HashSet.DTO.TrainDTO;

public interface TrainService {
	void addTrain(TrainDTO  dto);
	TrainDTO getTrain(int number);
	void updateTrain(TrainDTO dto);
	void deleteTrain(TrainDTO dto);
	

}
