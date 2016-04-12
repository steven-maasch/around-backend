package de.bht.ema.around.services;

import java.util.Date;
import java.util.List;

import de.bht.ema.around.exceptions.ChatNotFoundException;
import de.bht.ema.around.model.Chat;
import de.bht.ema.around.model.ChatMessage;
import org.springframework.web.context.request.async.DeferredResult;

import de.bht.ema.around.exceptions.SpotNotFoundException;
import de.bht.ema.around.model.User;

public interface ChatService {

	Chat getChatById(Long id) throws ChatNotFoundException;
	
	Iterable<Chat> getChatsBySpotId(Long spotId) throws SpotNotFoundException;
	
	Chat createChat(String name, Long spotId, User creator) throws SpotNotFoundException;
	
	void addMessageToChat(Long chatId, ChatMessage message) throws ChatNotFoundException;
	
	DeferredResult<List<ChatMessage>> getMessagesByChatIdAfterMessageIndexAsync(Long chatId, Long messageIndex) throws ChatNotFoundException;

	Iterable<ChatMessage> getAllMessagesByChatId(Long chatId) throws ChatNotFoundException;
	
	Iterable<ChatMessage> getAllMessagesByChatIdAfterCreatedOnOrderByCreatedOn(Long chatId, Date after) throws ChatNotFoundException;
		
	Iterable<ChatMessage> getAllMessagesByChatIdAndGreaterThanMessageIdOrderByMessageId(Long chatId, Long messageId) throws ChatNotFoundException;
}