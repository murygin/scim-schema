/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonMemberTypeDeserializer;
import org.osiam.resources.helper.JsonMemberTypeSerializer;

/**
 * possible enums for the Address Type
 *
 */
@JsonSerialize (using = JsonMemberTypeSerializer.class)
@JsonDeserialize (using = JsonMemberTypeDeserializer.class)
public enum MemberType{
	USER,
	GROUP
	;
}
