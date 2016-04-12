package de.bht.ema.around.repositories;

import org.springframework.data.repository.CrudRepository;

import de.bht.ema.around.model.BulletinBoard;

public interface BulletinBoardRepository extends CrudRepository<BulletinBoard, Long> { 
	
	Iterable<BulletinBoard> findAllBySpotId(Long id);
	
	Iterable<BulletinBoard> findAllBySpotIds(Iterable<Long> spotIds);
	
}