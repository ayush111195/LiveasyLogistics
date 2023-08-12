package com.loadsapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.loadsapi.entites.Payloads;
import com.loadsapi.services.LodsServices;



@RestController
public class Controller {
	
	@Autowired
	private  LodsServices lodsServices;

	@GetMapping("/loads")
	public ResponseEntity<List<Payloads>> getLoads() {

		List<Payloads> allLoad = this.lodsServices.getAllLoads();
		if (allLoad.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allLoad));

	}
	
	@GetMapping("/loads/{id}")
	public ResponseEntity<Payloads> getLoadById(@PathVariable("id") int id) {
		Payloads LoadById = this.lodsServices.getLoadById(id);
		if(LoadById!= null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(LoadById));

	}

	@PostMapping("/addLoad")
	public ResponseEntity<Payloads> addbook(@RequestBody Payloads payloads) { 
			try {
				Payloads addLoad = this.lodsServices.addLoads(payloads);
				return ResponseEntity.status(HttpStatus.CREATED).build();
			} catch (Exception e) {
				e.printStackTrace();
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}										
	
		}
	@DeleteMapping("/dltloads/{id}")
	public  ResponseEntity<Void> dltLoad(@PathVariable("id") int shipedId) {
		try {
			this.lodsServices.dltloads(shipedId);
			return  ResponseEntity.ok().build();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Payloads> updateload(@RequestBody Payloads payloads, @PathVariable("id") int id) {
		
		try {
			this.lodsServices.updatePayloads(payloads, id);
            return ResponseEntity.ok().body(payloads);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	
	}
}

