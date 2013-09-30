/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonPhoneNumberTypeDeserializer;
import org.osiam.resources.helper.JsonPhoneNumberTypeSerializer;

/**
 * possible enums for the Address Type
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
