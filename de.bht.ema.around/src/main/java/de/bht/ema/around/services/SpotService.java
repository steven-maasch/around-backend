package de.bht.ema.around.services;

import java.util.Set;

import javax.validation.ConstraintViolation;

import de.bht.ema.around.dto.SpotPostDto;
import de.bht.ema.around.model.Location;
import de.bht.ema.around.model.Spot;
import de.bht.ema.around.model.User;

public interface SpotService {

	Iterable<Spot> getAllSpots();
	
	Spot getSpotById(Long id);
	
	Spot saveSpot(Spot spot);
	
	Spot saveSpot(SpotPostDto spotDto, User owner);
	
	void deleteSpotById(Long id);
	
	Iterable<Spot> getAllSpotsWithinRange(Location location);
	
	Set<ConstraintViolation<SpotPostDto>> validateSpotPostDto(SpotPostDto dto);

}
