/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonPhoneNumberTypeDeserializer;
import org.osiam.resources.helper.JsonPhoneNumberTypeSerializer;
import org.osiam.resources.scim.PhoneNumber;

/**
possible types for the  {@link PhoneNumber } 
 *
 */
@JsonSerialize (using = JsonPhoneNumberTypeSerializer.class)
@JsonDeserialize (using = JsonPhoneNumberTypeDeserializer.class)
public enum PhoneNumberType{
	WORK,
	HOME,
	MOBILE,
	FAX,
	PAGER,
	OTHER
	;
}
