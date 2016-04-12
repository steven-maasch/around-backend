package de.bht.ema.around.services;

import de.bht.ema.around.exceptions.BulletinBoardNotFound;
import de.bht.ema.around.exceptions.SpotNotFoundException;
import de.bht.ema.around.model.BulletinBoard;
import de.bht.ema.around.model.BulletinBoardMessage;
import de.bht.ema.around.model.Location;
import de.bht.ema.around.model.User;

public interface BulletinBoardService {

	BulletinBoard getBulletinBoardById(Long id);
	
	Iterable<BulletinBoard> getBulletinBoardsBySpotId(Long id) throws SpotNotFoundException;
	
	Iterable<BulletinBoardMessage> getMessagesFromBulletinBoard(Long id) throws BulletinBoardNotFound;

	Iterable<BulletinBoard> getAllBulletinBoards();

	Iterable<BulletinBoard> getAllBulletinBoardsWithinRange(Location location);

	BulletinBoard createBulletinBoard(String name, Long spotId, User creator) throws SpotNotFoundException;

	void addMessageToBulletinBoard(Long id, BulletinBoardMessage message) throws BulletinBoardNotFound;

}
