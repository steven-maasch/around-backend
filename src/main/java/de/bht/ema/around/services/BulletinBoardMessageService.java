package de.bht.ema.around.services;

import de.bht.ema.around.exceptions.MediaWrapperNotFoundException;
import de.bht.ema.around.model.BulletinBoardMessage;
import de.bht.ema.around.model.User;

public interface BulletinBoardMessageService {

	BulletinBoardMessage createMessage(String messageText, Long mediaId, Long createdOn, User author) throws MediaWrapperNotFoundException;

	BulletinBoardMessage saveMessage(BulletinBoardMessage message);

	
}
