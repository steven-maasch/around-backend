package de.bht.ema.around.converter;

import java.io.File;

import com.fasterxml.jackson.databind.util.StdConverter;

public class FileToStringConverter extends StdConverter<File, String> {

	@Override
	public String convert(File file) {
		return file.getName();
	}
	
}
