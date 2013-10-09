/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.osiam.resources.type.PhoneNumberType;

/**
 * used to serialize a {@link PhoneNumberType} enum into a JSon String 
 *
 */
public class JsonPhoneNumberTypeSerializer extends JsonSerializer<PhoneNumberType> {

	  @Override
	  public void serialize(PhoneNumberType value, JsonGenerator generator, SerializerProvider provider) 
			  throws IOException {
			  generator.writeString(value.name().toLowerCase());
	  }
}
