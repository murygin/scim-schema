/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonImsTypeDeserializer;
import org.osiam.resources.helper.JsonImsTypeSerializer;

/**
 * possible types for the  {@link Ims } 
 */
@JsonSerialize (using = JsonImsTypeSerializer.class)
@JsonDeserialize (using = JsonImsTypeDeserializer.class)
public enum ImsType implements GenericType<ImsType>{
	AIM,
	GTALK,
	ICQ,
	XMPP,
	MSN,
	SKYPE,
	QQ,
	YAHOO
	;

	@Override
	public String toString(){
		return this.toString().toLowerCase();
	}
	
	public static ImsType fromString(String type) {
		return ImsType.valueOf(type.toUpperCase());
	}
}
