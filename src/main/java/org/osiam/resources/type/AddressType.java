/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonAddressTypeDeserializer;
import org.osiam.resources.helper.JsonAddressTypeSerializer;


/**
 * possible types for the  {@link Address } 
 */
@JsonSerialize (using = JsonAddressTypeSerializer.class)
@JsonDeserialize (using = JsonAddressTypeDeserializer.class)
public enum AddressType implements GenericType<AddressType> {
	WORK,
	HOME,
	OTHER
	;

	@Override
	public String toString(){
		return this.toString().toLowerCase();
	}
	
	public static AddressType fromString(String type) {
		return AddressType.valueOf(type.toUpperCase());
	}

}
