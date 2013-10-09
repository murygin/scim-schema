/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.osiam.resources.type.MemberType;

/**
 * used to serialize a {@link MemberType} enum into a JSon String 
 *
 */
public class JsonMemberTypeSerializer extends JsonSerializer<MemberType> {

	  @Override
	  public void serialize(MemberType value, JsonGenerator generator, SerializerProvider provider) 
			  throws IOException {
			  generator.writeString(value.name().toLowerCase());
	  }
}
