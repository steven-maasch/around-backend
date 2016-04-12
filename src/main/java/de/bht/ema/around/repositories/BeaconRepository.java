package de.bht.ema.around.repositories;

import de.bht.ema.around.model.Beacon;
import org.springframework.data.repository.CrudRepository;

public interface BeaconRepository extends CrudRepository<Beacon, Long> {

	Beacon findByUuidAndMajorAndMinor(String uuid, int major, int minor);
	
}
