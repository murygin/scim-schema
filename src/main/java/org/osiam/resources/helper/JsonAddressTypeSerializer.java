/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.osiam.resources.type.AddressType;

/**
 * used to serialize a {@link AddressType} enum into a JSon String 
 *
 */
public class JsonAddressTypeSerializer extends JsonSerializer<AddressType> {

	  @Override
	  public void serialize(AddressType value, JsonGenerator generator, SerializerProvider provider) 
			  throws IOException {
			  generator.writeString(value.name().toLowerCase());
	  }
}
