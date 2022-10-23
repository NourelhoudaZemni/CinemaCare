package com.esprit.Repository;

import com.esprit.entities.ReclamationParking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReclamationRepository extends CrudRepository<ReclamationParking,Integer> {

}
