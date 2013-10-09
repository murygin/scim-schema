/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.osiam.resources.type.EmailType;

/**
 * used to serialize a {@link EmailType} enum into a JSon String 
 *
 */
public class JsonEmailTypeSerializer extends JsonSerializer<EmailType> {

	  @Override
	  public void serialize(EmailType value, JsonGenerator generator, SerializerProvider provider) 
			  throws IOException {
			  generator.writeString(value.name().toLowerCase());
	  }
}
