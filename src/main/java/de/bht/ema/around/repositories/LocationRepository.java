package de.bht.ema.around.repositories;

import org.springframework.data.repository.CrudRepository;

import de.bht.ema.around.model.Location;

public interface LocationRepository extends CrudRepository<Location, Long> { 
	
	Location findByLatitudeAndLongitude(double latitude, double longitude);
	
}