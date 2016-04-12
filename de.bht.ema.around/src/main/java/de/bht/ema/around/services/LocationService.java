package de.bht.ema.around.services;

import de.bht.ema.around.model.Location;

public interface LocationService {

	Location saveLocation(Location location);
	
	Location getByLatitudeAndLongitude(double latitude, double longitude);

}
