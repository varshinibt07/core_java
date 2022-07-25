package com.xworkz.corejava.Collection_Framework.Set.HashSet;

import java.util.HashSet;

import com.xworkz.corejava.Collection_Framework.Set.HashSet.DTO.TrainDTO;
import com.xworkz.corejava.Collection_Framework.Set.HashSet.Service.TrainService;
import com.xworkz.corejava.Collection_Framework.Set.HashSet.Service.TrainServiceImpl;

public class TrainApplication {

	public static void main(String[] args) {
		TrainDTO channamma = new TrainDTO();
		channamma.setDestination("Dharwad");
		channamma.setName("Rani Channamma");
		channamma.setNoofcompartmnets(20);
		channamma.setNumber(17456);
		channamma.setPrice(350.00);
		channamma.setSource("Bangalore");
		
		TrainDTO Shatabdi = new TrainDTO();
		Shatabdi.setDestination("Mysore");
		Shatabdi.setName("Shatabdi");
		Shatabdi.setNoofcompartmnets(40);
		Shatabdi.setNumber(17444);
		Shatabdi.setPrice(100.0);
		Shatabdi.setSource("Bangalore");
		
//		HashSet hs = new HashSet();
//		hs.add(Shatabdi);
//		hs.add(channamma);
//		
//		System.out.println(hs);
		
		TrainService service = new TrainServiceImpl();
		service.addTrain(Shatabdi);
		service.addTrain(channamma);
		
		
	    TrainDTO traindto = service.getTrain(17444);
		System.out.println("The getting Train number details is : "+traindto);
		
		Shatabdi.setName("Shatabdi express");
		service.updateTrain(Shatabdi);
		
		service.deleteTrain(channamma);
		
	}

}
