/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonEmailTypeDeserializer;
import org.osiam.resources.helper.JsonEmailTypeSerializer;
import org.osiam.resources.scim.Email;

/**
 * possible types for the  {@link Email } 
 */
@JsonSerialize (using = JsonEmailTypeSerializer.class)
@JsonDeserialize (using = JsonEmailTypeDeserializer.class)
public enum EmailType{
	WORK,
	HOME,
	OTHER
	;
}
