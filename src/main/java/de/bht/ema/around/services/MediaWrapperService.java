package de.bht.ema.around.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import de.bht.ema.around.exceptions.FileExtensionDetectionException;
import de.bht.ema.around.exceptions.UnsupportedMimeTypeException;
import de.bht.ema.around.model.MediaWrapper;
import de.bht.ema.around.model.User;
import org.apache.tika.mime.MimeType;

public interface MediaWrapperService {
	
	/**
	 * @param inputStream
	 * @param owner
	 * @return
	 * @throws IOException
	 * @throws UnsupportedMimeTypeException
	 * @throws FileExtensionDetectionException
	 */
	MediaWrapper saveMedia(InputStream inputStream, User owner) throws IOException;
	
	List<MimeType> getSupportedMimeTypes();
	
	List<String> getSupportedMimeTypesAsString();

	MediaWrapper getMediaWrapperById(Long mediaId);
	
}
