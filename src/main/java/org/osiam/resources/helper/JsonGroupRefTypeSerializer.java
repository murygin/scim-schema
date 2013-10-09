/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.osiam.resources.type.GroupRefType;

/**
 * used to serialize a {@link GroupRefType} enum into a JSon String 
 *
 */
public class JsonGroupRefTypeSerializer extends JsonSerializer<GroupRefType> {

	  @Override
	  public void serialize(GroupRefType value, JsonGenerator generator, SerializerProvider provider) 
			  throws IOException {
			  generator.writeString(value.name().toLowerCase());
	  }
}
