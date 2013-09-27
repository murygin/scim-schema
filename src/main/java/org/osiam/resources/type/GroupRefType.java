/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonGroupRefTypeDeserializer;
import org.osiam.resources.helper.JsonGroupRefTypeSerializer;

/**
 * possible enums for the Address Type
 *
 */
@JsonSerialize (using = JsonGroupRefTypeSerializer.class)
@JsonDeserialize (using = JsonGroupRefTypeDeserializer.class)
public enum GroupRefType{
	DIRECT,
	INDIRECT
	;
}
