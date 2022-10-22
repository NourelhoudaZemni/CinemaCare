package tn.esprit.spring.services;

import java.util.Optional;

import tn.esprit.spring.entities.Parking;

public interface IParkingService {

	Parking ajouter(Parking  parking);

	Parking update(Parking parking, Long id);

  public Parking DiminuerEspaceLibre(Long id);


	void supprimer(Long  id);

	Iterable<Parking> afficher();

	Parking findById(Long id);

}
