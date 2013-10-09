/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.osiam.resources.type.PhotoType;

/**
 * used to serialize a {@link PhotoType} enum into a JSon String 
 *
 */
public class JsonPhotoTypeSerializer extends JsonSerializer<PhotoType> {

	  @Override
	  public void serialize(PhotoType value, JsonGenerator generator, SerializerProvider provider) 
			  throws IOException {
			  generator.writeString(value.name().toLowerCase());
	  }
}
