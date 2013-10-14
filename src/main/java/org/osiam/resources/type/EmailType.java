/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonEmailTypeDeserializer;
import org.osiam.resources.helper.JsonEmailTypeSerializer;

/**
 * possible types for the  {@link Email } 
 */
@JsonSerialize (using = JsonEmailTypeSerializer.class)
@JsonDeserialize (using = JsonEmailTypeDeserializer.class)
public enum EmailType implements GenericType<EmailType> {
	WORK,
	HOME,
	OTHER
	;

	@Override
	public EmailType fromString(String type) {
		return EmailType.valueOf(type.toUpperCase());
	}
	
	@Override
	public String toString(){
		return this.toString().toLowerCase();
	}
}
