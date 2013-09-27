/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonAddressTypeDeserializer;
import org.osiam.resources.helper.JsonAddressTypeSerializer;


/**
 * possible enums for the Address Type
 *
 */
@JsonSerialize (using = JsonAddressTypeSerializer.class)
@JsonDeserialize (using = JsonAddressTypeDeserializer.class)
public enum AddressType {
	WORK,
	HOME,
	OTHER
	;
}
