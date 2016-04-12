package de.bht.ema.around.services;

import de.bht.ema.around.exceptions.MediaWrapperNotFoundException;
import de.bht.ema.around.model.ChatMessage;
import de.bht.ema.around.model.User;

public interface ChatMessageService {
		
	ChatMessage createMessage(String messageText, Long mediaId, Long createdOn, User author) throws MediaWrapperNotFoundException;
	
	ChatMessage saveMessage(ChatMessage message);
	
}
