package com.xworkz.corejava.Collection_Framework.Set.HashSet.DAO;

import java.util.HashSet;

import com.xworkz.corejava.Collection_Framework.List.Vector_List.VectotList_DTO_DAO.DTO.FlightDTO;
import com.xworkz.corejava.Collection_Framework.Set.HashSet.DTO.TrainDTO;

public class TrainDAOImpl implements TrainDAO{
	HashSet<TrainDTO> hashset = new HashSet<TrainDTO>();
	//converting Hashset to Arraylist
	
	@Override
	public void addTrain(TrainDTO dto) {
		// TODO Auto-generated method stub
		hashset.add(dto);
		System.out.println("The train details added :"+ dto);
	}
	
	public TrainDTO getTrain(int number) {
		Object[] trains = hashset.toArray();
		Integer count=0;
		//int i;
		for(int i=0; i<trains.length; i++) {
		//	System.out.println(trains.length);
			TrainDTO train = (TrainDTO)trains[i];
	
			if(trains[i]!=null && train.getNumber()== number) {
				count++;
			}
		}	
			if(count != 0) {
				return (TrainDTO)trains[count];
			}
			else {
				return null;
			}
	}
		
	
	public void updateTrain(TrainDTO dto) {
		Object[] trains = hashset.toArray();
        int count=0;
		for(int i = 0; i < trains.length; i++) {
			TrainDTO train = (TrainDTO) trains[i];
			if(trains[i]!=null&& train.getName().equals(dto.getName())) {
				count++;
				train.setName(dto.getName());
				
				System.out.println("The  Train Details updated: " + trains[i]);
			}			
		}
		if (count == 0) {
			System.out.println(" Train Details not found");
		}
	}
	@Override
	public void deleteTrain(TrainDTO dto) {
		hashset.remove(dto);
		System.out.println("Train tickets had been canceled:"+ dto);
		
	}

	


}