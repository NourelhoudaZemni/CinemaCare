package com.esprit.Services;
import java.util.List;
import java.util.Optional;

import com.esprit.entities.ReclamationParking;


public interface IRecParkingService {
	List<ReclamationParking> retrieveAll();
  ReclamationParking add(ReclamationParking a);
	void delete(ReclamationParking a);
  ReclamationParking update(ReclamationParking a);
	Optional<ReclamationParking> retrieve(int id);
}
