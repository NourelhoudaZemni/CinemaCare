package com.esprit.Services;
import java.util.List;
import java.util.Optional;

import com.esprit.Repository.ParkingRepository;
import com.esprit.entities.Parking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ParkingService implements IParkingService {

	@Autowired
  ParkingRepository pr;

	@Override
	public List<Parking> retrieveAll() {
		List <Parking> al =(List<Parking>) pr.findAll();
		return al;
	}

	@Override
	public Parking add(Parking a) {
		return (Parking) pr.save(a);
	}

	@Override
	public void delete(Parking a) {
    pr.deleteById(a.getId());

	}

	@Override
	public Parking update(Parking a) {
		Parking al = (Parking) pr.save(a);
		return al;
	}

	@Override
	public Optional<Parking> retrieve(int id) {
		Optional<Parking> a=pr.findById(id);
		return a;
	}

}
