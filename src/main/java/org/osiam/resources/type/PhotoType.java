/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonPhotoTypeDeserializer;
import org.osiam.resources.helper.JsonPhotoTypeSerializer;
import org.osiam.resources.scim.Photo;

/**
 * possible types for the  {@link Photo } 
 */
@JsonSerialize (using = JsonPhotoTypeSerializer.class)
@JsonDeserialize (using = JsonPhotoTypeDeserializer.class)
public enum PhotoType{
	PHOTO,
	THUMBNAIL
	;
}
