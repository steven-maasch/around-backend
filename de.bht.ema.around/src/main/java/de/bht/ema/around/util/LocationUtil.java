package de.bht.ema.around.util;

import de.bht.ema.around.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LocationUtil {

	@Autowired
	@Qualifier("currentCalculateDistanceStrategy")
	private CalculateDistance calculateDistanceStrategy;
	
	/**
	 * @param location1
	 * @param location2
	 * @return The distance in meters
	 */
	public double calculateDistance(Location location1, Location location2) {
		return calculateDistanceStrategy.calculateDistance(
				location1.getLatitude(),
				location1.getLongitude(), 
				location2.getLatitude(), 
				location2.getLongitude());
	}
	
}
