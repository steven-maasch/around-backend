package de.bht.ema.around.repositories;

import de.bht.ema.around.model.ChatMessage;
import org.springframework.data.repository.CrudRepository;

public interface ChatMessageRepository extends CrudRepository<ChatMessage, Long> {
	
}
