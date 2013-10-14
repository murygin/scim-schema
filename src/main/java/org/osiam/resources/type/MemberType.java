/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonMemberTypeDeserializer;
import org.osiam.resources.helper.JsonMemberTypeSerializer;

/**
 * possible types for the  {@link Member } 
 */
@JsonSerialize (using = JsonMemberTypeSerializer.class)
@JsonDeserialize (using = JsonMemberTypeDeserializer.class)
public enum MemberType implements GenericType<MemberType>{
	USER ("User"),
	GROUP ("Group")
	;

	private String value;
	
	private MemberType(String value){
		this.value = value;
	}
	@Override
	public MemberType fromString(String type) {
		return MemberType.valueOf(type.toUpperCase());
	}
	
	@Override
	public String toString(){
		return value;
	}
}
