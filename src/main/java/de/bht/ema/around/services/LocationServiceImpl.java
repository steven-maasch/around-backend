package de.bht.ema.around.services;

import de.bht.ema.around.model.Location;
import de.bht.ema.around.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	public Location getByLatitudeAndLongitude(double latitude, double longitude) {
		return locationRepository.findByLatitudeAndLongitude(latitude, longitude);
	}

	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

}
