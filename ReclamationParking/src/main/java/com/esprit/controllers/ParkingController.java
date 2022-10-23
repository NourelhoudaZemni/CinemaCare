package com.esprit.controllers;
import java.util.List;
import java.util.Optional;

import com.esprit.Services.IRecParkingService;
import com.esprit.entities.ReclamationParking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ParkingController {
	@Autowired
  IRecParkingService parkingService;

	//http://localhost:8080/SpringMVC/servlet/allCoffee
	//@CrossOrigin(origins ="*")
	@GetMapping("/all")
	@ResponseBody
	public List<ReclamationParking> get(){
		List<ReclamationParking> l=parkingService.retrieveAll();
		return l;
	}

	@PostMapping("/add")
	@ResponseBody
	public ReclamationParking add(@RequestBody ReclamationParking a) {
		return parkingService.add(a);
	}

	@PostMapping("/delete")
	@ResponseBody
	public void delete(@RequestBody ReclamationParking a) {
    parkingService.delete(a);
	}

	@GetMapping("/get/{id}")
	@ResponseBody
	public Optional<ReclamationParking> getUser(@PathVariable(value = "id")int id){
		Optional<ReclamationParking> a=parkingService.retrieve(id);
		return a;
	}

	@PostMapping("/update")
	@ResponseBody
	public ReclamationParking updateAchat(@RequestBody ReclamationParking a) {
		return parkingService.update(a);
	}


}
