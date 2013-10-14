/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonPhoneNumberTypeDeserializer;
import org.osiam.resources.helper.JsonPhoneNumberTypeSerializer;

/**
 * possible types for the  {@link PhoneNumber } 
 */
@JsonSerialize (using = JsonPhoneNumberTypeSerializer.class)
@JsonDeserialize (using = JsonPhoneNumberTypeDeserializer.class)
public enum PhoneNumberType implements GenericType<PhoneNumberType>{
	WORK,
	HOME,
	MOBILE,
	FAX,
	PAGER,
	OTHER
	;

	@Override
	public PhoneNumberType fromString(String type) {
		return PhoneNumberType.valueOf(type.toUpperCase());
	}
	
	@Override
	public String toString(){
		return this.toString().toLowerCase();
	}
}
