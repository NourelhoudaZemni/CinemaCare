package com.esprit.Repository;

import com.esprit.entities.Parking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParkingRepository extends CrudRepository<Parking,Integer> {

}
