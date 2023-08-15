package com.loadsapi.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loadsapi.dao.LoadsRepo;
import com.loadsapi.entites.Payloads;



@Service
public class LodsServices{
	
@Autowired
private LoadsRepo loadsRepo ;
	
//for create the payloads--->>
	
public Payloads addLoads(Payloads  p) {
	
 Payloads save=  loadsRepo.save(p);
 
	return save;
	
}

//for get payload by id---->>

public Payloads getLoadById(int id) {
	

	Payloads payloads = null;
	try {
		payloads= this.loadsRepo.getById(id);

	} catch (Exception e2) {
		e2.printStackTrace();
	}
	return payloads;
		
}

	
//for update the payloads-->>

public void updatePayloads(Payloads payloads, int id) {
	payloads.setShipperId(id);
	loadsRepo.save(payloads);
}

		
		
//for get all payloads--->>

public List<Payloads> getAllLoads() {

	List<Payloads> list = (List<Payloads>) this.loadsRepo.findAll();

	return list;

}
		
		
//for dlt the Payloads--->>
		
public void dltloads(int bid) {
	loadsRepo.deleteById(bid);
	
}

}
