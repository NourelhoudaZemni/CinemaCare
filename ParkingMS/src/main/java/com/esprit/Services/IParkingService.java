package com.esprit.Services;
import java.util.List;
import java.util.Optional;

import com.esprit.entities.Parking;


public interface IParkingService {
	List<Parking> retrieveAll();
	Parking add(Parking a);
	void delete(Parking a);
	Parking update(Parking a);
	Optional<Parking> retrieve(int id);
}
