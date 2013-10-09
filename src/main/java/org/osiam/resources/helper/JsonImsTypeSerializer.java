/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;
import java.util.Locale;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.osiam.resources.type.ImsType;

/**
 * used to serialize a {@link ImsType} enum into a JSon String 
 *
 */
public class JsonImsTypeSerializer extends JsonSerializer<ImsType> {

	  @Override
	  public void serialize(ImsType value, JsonGenerator generator, SerializerProvider provider) 
			  throws IOException {
			  generator.writeString(value.name().toLowerCase(Locale.ENGLISH)); 
	  }
}
