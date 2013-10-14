/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonPhotoTypeDeserializer;
import org.osiam.resources.helper.JsonPhotoTypeSerializer;

/**
 * possible types for the  {@link Photo } 
 */
@JsonSerialize (using = JsonPhotoTypeSerializer.class)
@JsonDeserialize (using = JsonPhotoTypeDeserializer.class)
public enum PhotoType implements GenericType<PhotoType>{
	PHOTO,
	THUMBNAIL
	;

	@Override
	public PhotoType fromString(String type) {
		return PhotoType.valueOf(type.toUpperCase());
	}
	
	@Override
	public String toString(){
		return this.toString().toLowerCase();
	}
	
}
