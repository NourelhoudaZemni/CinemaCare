package com.esprit.Services;
import java.util.List;
import java.util.Optional;

import com.esprit.Repository.ReclamationRepository;
import com.esprit.entities.ReclamationParking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ParkingService implements IRecParkingService {

	@Autowired
  ReclamationRepository pr;

	@Override
	public List<ReclamationParking> retrieveAll() {
		List <ReclamationParking> al =(List<ReclamationParking>) pr.findAll();
		return al;
	}

	@Override
	public ReclamationParking add(ReclamationParking a) {
		return (ReclamationParking) pr.save(a);
	}

	@Override
	public void delete(ReclamationParking a) {
    pr.deleteById(a.getId());

	}

	@Override
	public ReclamationParking update(ReclamationParking a) {
    ReclamationParking al = (ReclamationParking) pr.save(a);
		return al;
	}

	@Override
	public Optional<ReclamationParking> retrieve(int id) {
		Optional<ReclamationParking> a=pr.findById(id);
		return a;
	}

}
