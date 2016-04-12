package de.bht.ema.around.services;

import java.util.Date;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.bht.ema.around.exceptions.MediaWrapperNotFoundException;
import de.bht.ema.around.model.BulletinBoardMessage;
import de.bht.ema.around.model.MediaWrapper;
import de.bht.ema.around.model.User;
import de.bht.ema.around.repositories.BulletinBoardMessageRepository;

@Service
@Transactional
public class BulletinBoardMessageServiceImpl implements BulletinBoardMessageService {

	private static final Logger logger = LoggerFactory.getLogger(BulletinBoardMessageServiceImpl.class);
	
	@Autowired
	private BulletinBoardMessageRepository bulletinBoardMessageRepository;
	
	@Autowired
	private MediaWrapperService mediaWrapperService;

	/* (non-Javadoc)
	 * @see BulletinBoardMessageService#createMessage(java.lang.String, java.lang.Long, java.lang.Long, User)
	 */
	@Override
	public BulletinBoardMessage createMessage(String messageText, Long mediaId, Long createdOn, User author) throws MediaWrapperNotFoundException {
		MediaWrapper mediaWrapper = null;
		if (mediaId != null) {
			mediaWrapper = mediaWrapperService.getMediaWrapperById(mediaId);
			if (mediaWrapper == null) {
				logger.warn("No media wrapper with id {} found", mediaId);
				throw new MediaWrapperNotFoundException("No media with id " + mediaId + " found");
			}
		}
		final BulletinBoardMessage message = new BulletinBoardMessage(messageText, mediaWrapper, new Date(createdOn), author);
		return message;
	}

	/* (non-Javadoc)
	 * @see BulletinBoardMessageService#saveMessage(BulletinBoardMessage)
	 */
	@Override
	public BulletinBoardMessage saveMessage(BulletinBoardMessage message) {
		return bulletinBoardMessageRepository.save(message);
	}

}
