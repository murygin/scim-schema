package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.osiam.resources.scim.Address;

public class AddressTypeSerializer extends JsonSerializer<Address.Type> {

	  @Override
	  public void serialize(Address.Type value, JsonGenerator generator,
	            SerializerProvider provider) throws IOException,
	            JsonProcessingException {

	    generator.writeStartObject();
	    generator.writeFieldName("type");
	    generator.writeString(value.toString());
	    generator.writeEndObject();
	  }

}
