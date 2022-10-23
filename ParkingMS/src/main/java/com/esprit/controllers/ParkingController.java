package com.esprit.controllers;
import java.util.List;
import java.util.Optional;

import com.esprit.Services.IParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.entities.Parking;



@RestController
public class ParkingController {
	@Autowired
  IParkingService parkingService;

	//http://localhost:8080/SpringMVC/servlet/allCoffee
	//@CrossOrigin(origins ="*")
	@GetMapping("/all")
	@ResponseBody
	public List<Parking> get(){
		List<Parking> l=parkingService.retrieveAll();
		return l;
	}

	@PostMapping("/add")
	@ResponseBody
	public Parking add(@RequestBody Parking a) {
		return parkingService.add(a);
	}

	@PostMapping("/delete")
	@ResponseBody
	public void delete(@RequestBody Parking a) {
    parkingService.delete(a);
	}

	@GetMapping("/get/{id}")
	@ResponseBody
	public Optional<Parking> getUser(@PathVariable(value = "id")int id){
		Optional<Parking> a=parkingService.retrieve(id);
		return a;
	}

	@PostMapping("/update")
	@ResponseBody
	public Parking updateAchat(@RequestBody Parking a) {
		return parkingService.update(a);
	}


}
