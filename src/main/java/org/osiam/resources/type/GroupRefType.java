/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonGroupRefTypeDeserializer;
import org.osiam.resources.helper.JsonGroupRefTypeSerializer;

/**
 * possible types for the  {@link GroupRef } 
 */
@JsonSerialize (using = JsonGroupRefTypeSerializer.class)
@JsonDeserialize (using = JsonGroupRefTypeDeserializer.class)
public enum GroupRefType implements GenericType<GroupRefType>{
	DIRECT,
	INDIRECT
	;

	@Override
	public GroupRefType fromString(String type) {
		return GroupRefType.valueOf(type.toUpperCase());
	}
	
	@Override
	public String toString(){
		return this.toString().toLowerCase();
	}
}
